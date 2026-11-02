package com.alireza.springsecurityonly.credentialManager;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "user_credentials", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email", name = "uk_credentiald_email"),
        @UniqueConstraint(columnNames = "username", name = "uk_credentials_username")
})
public class UserCredentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    // Application Side
    private Long id;
    // User Side
    @Column(nullable = false, unique = true, length = 254)
    private String email;
    // User Side
    @Column(nullable = false, unique = true, length = 30)
    private String username;
    // User Side
    @Column(name = "password_hash", nullable = false, length = 100)
    private String passwordHash;

    // Application Side
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Role role = Role.USER;

    // Application Side
    @Column(nullable = false)
    private boolean enabled = true;
    // Application Side
    @Column(nullable = false)
    private boolean locked = false;
    // Application Side
    @Column(nullable = false, updatable = false)
    private Instant createdAt = Instant.now();
}
