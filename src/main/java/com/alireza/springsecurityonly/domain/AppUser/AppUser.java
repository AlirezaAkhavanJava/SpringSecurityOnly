package com.alireza.springsecurityonly.domain.AppUser;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

// DataBase Table Mirror here
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(unique = true, nullable = false, updatable = false, insertable = false)
    private Long id;

    @Column(unique = true, nullable = false, length = 60)
    @NotBlank
    private String username;

    @Column(nullable = false)
    @NotBlank
    private String password;

    @Column(nullable = false, unique = true)
    @NotBlank
    private String email;
}
