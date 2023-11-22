package com.uexcel.resourceserver.service;

import org.springframework.security.access.prepost.PreAuthorize;

public interface ResourceService {
    @PreAuthorize(value = "SCOPE_user.read")
    String greet();
}
