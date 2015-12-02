package com.vdzon.msw.edgeserver.services;


import com.vdzon.msw.edgeserver.authentication.AuthUser;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {

    public String getUserUuid() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof AuthUser) {
            AuthUser user = (AuthUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            return user.getUuid();
        }
        return null;
    }
}
