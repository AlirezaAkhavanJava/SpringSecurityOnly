package com.alireza.springsecurityonly.domain.AppUser;

public interface AppUserMapper {
    AppUser fromDto(CreateUserRequest dto);
    CreateUserRequest fromEntity(AppUser dto);
}
