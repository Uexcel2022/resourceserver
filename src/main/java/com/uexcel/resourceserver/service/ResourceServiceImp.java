package com.uexcel.resourceserver.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
@Service
public class ResourceServiceImp implements ResourceService {
    @Override
    @PreAuthorize(value = "SCOPE_user.read")
    public String greet() {
        var jwt =
                (Jwt) SecurityContextHolder.getContext()
                        .getAuthentication().getPrincipal();
       return  "Hello, from " + jwt.getSubject();
    }
}
