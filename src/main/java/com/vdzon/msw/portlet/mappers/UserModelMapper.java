package com.vdzon.msw.portlet.mappers;

import com.vdzon.msw.servicelayer.model.User;
import com.vdzon.msw.portlet.models.UserModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserModelMapper implements ModelMapper<UserModel, User> {

    @Override
    public User mergeModel(final UserModel model, User user) {
        user.setUsername(model.getUsername());
        return user;
    }

    @Override
    public UserModel toModel(final User user) {
        if (user == null) return null;
        UserModel userModel = new UserModel();
        userModel.setUsername(user.getUsername());
        userModel.setUuid(user.getUuid());
        return userModel;
    }

    @Override
    public List<UserModel> toModel(User[] users) {
        List<UserModel> userModels = new ArrayList<UserModel>();
        for (User user : users) {
            userModels.add(toModel(user));
        }
        return userModels;
    }

}
