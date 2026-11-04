package com.marcus.chronos.user.repository;

import com.marcus.chronos.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
