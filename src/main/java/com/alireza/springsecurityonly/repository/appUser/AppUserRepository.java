package com.alireza.springsecurityonly.repository.appUser;

import com.alireza.springsecurityonly.domain.AppUser.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
