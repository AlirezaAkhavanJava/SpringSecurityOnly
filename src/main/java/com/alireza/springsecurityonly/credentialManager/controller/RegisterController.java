package com.alireza.springsecurityonly.credentialManager.controller;

import com.alireza.springsecurityonly.credentialManager.domain.request.RegisterRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {


    @PostMapping("/new")
    public ResponseEntity<Void> registerUser(@Valid @RequestBody RegisterRequest user) {
        return ResponseEntity.ok().build();
    }

}
