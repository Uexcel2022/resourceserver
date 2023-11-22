package com.uexcel.resourceserver.controller;

import com.uexcel.resourceserver.service.ResourceService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {
    private final ResourceService resourceService;
    public HomeController(ResourceService resourceService){
        this.resourceService =resourceService;
    }
    @GetMapping("/home")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok(resourceService.greet());
    }
}
