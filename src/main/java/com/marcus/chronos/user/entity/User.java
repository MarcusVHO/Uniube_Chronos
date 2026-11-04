package com.marcus.chronos.user.entity;

import com.marcus.chronos.user.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@NoArgsConstructor
public class User {
    public User(String name, String passwordHash, UserRole role) {
        this.name = name;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String name;

    @Setter
    private String passwordHash;

    @Setter
    private UserRole role;

}
