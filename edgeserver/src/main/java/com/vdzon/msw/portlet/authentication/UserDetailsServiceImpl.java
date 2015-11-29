package com.vdzon.msw.portlet.authentication;

import com.vdzon.msw.portlet.dto.AuthenticationUserDto;
import com.vdzon.msw.portlet.rest.PortletResourceHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import javax.inject.Inject;
import java.util.HashSet;
import java.util.Set;


@Service("userDetailsService")
public class UserDetailsServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {

    @Inject
    PortletResourceHelper portletResourceHelper;

    @Override
    public UserDetails loadUserByUsername(final String username)
            throws UsernameNotFoundException {
        UriComponentsBuilder uriBuilder = portletResourceHelper.getUri("authentication", "findByUsername");
        uriBuilder.queryParam("username", username);
        ResponseEntity<AuthenticationUserDto> response = portletResourceHelper.<AuthenticationUserDto>proxyGetEntity(uriBuilder, AuthenticationUserDto.class);
        if (response.getStatusCode() != HttpStatus.OK) {
            throw new UsernameNotFoundException("Unable to fetch user details");
        }
        AuthenticationUserDto authenticationUserDto = response.getBody();
        if (authenticationUserDto == null) throw new UsernameNotFoundException("user not found");

        Set<GrantedAuthority> setAuths = new HashSet<>();
        String permissions = authenticationUserDto.getPermissions();
        for (String permission : permissions.split(",")) {
            setAuths.add(new SimpleGrantedAuthority(permission));
        }
        UserDetails userDetails = new AuthUser(setAuths, authenticationUserDto.getUuid(), authenticationUserDto.getPasswd(), username);
        return userDetails;
    }
}