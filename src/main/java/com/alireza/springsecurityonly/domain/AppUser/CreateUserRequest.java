package com.alireza.springsecurityonly.domain.AppUser;

import jakarta.validation.constraints.*;

public record CreateUserRequest(
        @NotBlank @NotNull @Size(max = 60, min = 6) String username,
        @NotBlank @NotNull @Size(min = 8, max = 256) String password,
        @NotBlank @NotNull @Email String email
) {
}
