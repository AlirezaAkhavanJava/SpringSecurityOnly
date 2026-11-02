package com.alireza.springsecurityonly.credentialManager.domain.request;


import jakarta.validation.constraints.NotBlank;

public record LoginRequest(
        @NotBlank String identifier,     // email OR username
        @NotBlank String password
) {
}