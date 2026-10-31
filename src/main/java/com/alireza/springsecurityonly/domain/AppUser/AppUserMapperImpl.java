package com.alireza.springsecurityonly.domain.AppUser;

import org.springframework.stereotype.Component;

@Component
public class AppUserMapperImpl implements AppUserMapper {

    @Override
    public AppUser fromDto(CreateUserRequest dto) {
        AppUser appUser = new AppUser();
        appUser.setUsername(dto.username());
        appUser.setPassword(dto.password());
        appUser.setEmail(dto.email());
        return appUser;
    }

    @Override
    public CreateUserRequest fromEntity(AppUser appUser) {
        return new CreateUserRequest(
                appUser.getUsername(),
                appUser.getPassword(),
                appUser.getEmail()
        );
    }
}
