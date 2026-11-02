package com.alireza.springsecurityonly.controller;

import org.springframework.security.access.prepost.PreAuthorize;

@PreAuthorize("hasRole('ADMIN')")
public class LoginController {
}
