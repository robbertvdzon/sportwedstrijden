package com.vdzon.msw.importmsw.initialisation;

import com.vdzon.msw.shared.dto.AuthenticationUserDto;
import com.vdzon.msw.shared.dto.UserDto;
import com.vdzon.msw.importmsw.mapper.AuthenticationUserMapper;
import com.vdzon.msw.importmsw.mapper.UserMapper;
import com.vdzon.msw.importmsw.model.Competition;
import com.vdzon.msw.importmsw.model.Teammember;
import com.vdzon.msw.importmsw.model.User;
import com.vdzon.msw.importmsw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.inject.Inject;
import java.util.Date;

@Service
public class InitialisationService {

    public static final String SERVICE = "import";

    @Inject
    UserMapper userMapper;

    @Inject
    AuthenticationUserMapper authenticationUserMapper;

    @Inject
    UserRepository userRepository;

    @Value("${storage.server.host}")
    private String storageServerHost;

    @Value("${storage.server.port}")
    private String storageServerPort;


    private boolean initialized = false;

    public boolean isInitialized() {
        return initialized;
    }

    public void initialize() {
        try{
            importFromMsw();
        }
        catch(Exception ex){
            ex.printStackTrace();
            // try again, the service is not up yet. We must change this later, then just every night
            try {
                Thread.sleep(90*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            importFromMsw();

        }
    }

    public void importFromMsw() {
        System.out.println("Import all users from old database");

        UriComponentsBuilder uriUserBuilder = UriComponentsBuilder.fromUriString("http://" + storageServerHost + ":" + storageServerPort).path("/api/" + SERVICE + "/importUser");
        UriComponentsBuilder uriAuthUserBuilder = UriComponentsBuilder.fromUriString("http://" + storageServerHost + ":" + storageServerPort).path("/api/" + SERVICE + "/importAuthenticationUser");

        RestTemplate restTemplate = new RestTemplate();

        System.out.println("Find robbert");
        User robbert = userRepository.findByUsername("robbert");
        migrate(uriUserBuilder, uriAuthUserBuilder, restTemplate, robbert);

//        Iterable<User> all = userRepository.findAll();
//        long start = new Date().getTime();
//        int count = 0;
//        for (User u : all) {
//            if (activeUser(u)) {
//                migrate(uriUserBuilder, uriAuthUserBuilder, restTemplate, u);
//                count++;
//                long time = new Date().getTime();
//                long diff = time-start;
//                long average = diff/count;
//                System.out.println("run "+count+" :"+average );
//
//            }
//        }
        System.out.println("finished");

    }

    private void migrate(UriComponentsBuilder uriUserBuilder, UriComponentsBuilder uriAuthUserBuilder, RestTemplate restTemplate, User u) {
        UserDto userDto = userMapper.toDto(u);
        AuthenticationUserDto authenticationUserDto = authenticationUserMapper.toDto(u);

        System.out.println("Call post:"+userDto.getUsername());

        restTemplate.put(uriUserBuilder.build().toUri(), userDto);
        restTemplate.put(uriAuthUserBuilder.build().toUri(), authenticationUserDto);
    }


    private boolean activeUser(User user) {
        for (Teammember teammmber : user.getTeammembers()) {
            for (Competition competition : teammmber.getTeam().getCompetitions()) {
                if (!competition.getGames().isEmpty()) return true;
            }
        }
        return false;
    }


}
