package com.cognizant.authenticationservice.controller;

import com.cognizant.authenticationservice.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class AuthenticationController {

    @Autowired
    JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(Authentication authentication) {

        String token = jwtUtil.generateToken(authentication.getName());

        return Collections.singletonMap("token", token);
    }
}