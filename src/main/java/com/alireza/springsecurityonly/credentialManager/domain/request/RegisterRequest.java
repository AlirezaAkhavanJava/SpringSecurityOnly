package com.alireza.springsecurityonly.credentialManager.domain.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

// User Side
public record RegisterRequest(
        @NotBlank(message = "Email is required")
        @Email(message = "Email is not valid")
        @Size(max = 254)
        String email,

        @NotBlank(message = "Username is required")
        @Size(min = 3, max = 30, message = "Username must be 3 to 30 characters")
        @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Username may contain only letters, digits and underscore")
        String username,

        @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d).+$",
                message = "Password must contain a letter and a digit")
        String password

) {
}
