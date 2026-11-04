package com.marcus.chronos.user.service;

import com.marcus.chronos.user.dto.request.CreateUserRequest;
import com.marcus.chronos.user.entity.User;
import com.marcus.chronos.user.enums.UserRole;
import com.marcus.chronos.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService {
    private final UserRepository repository;

    public CreateUserService(UserRepository repository) {
        this.repository = repository;
    }

    public void createEstudante(CreateUserRequest request) {
       this.create(request, UserRole.ESTUDANTE);
    }

    public void createDocente(CreateUserRequest request) {
        this.create(request, UserRole.DOCENTE);
    }

    private void create(CreateUserRequest request, UserRole role) {
        User newUser = new User(request.name(), request.password(), role);
        repository.save(newUser);
    }

    public void createAdmin( CreateUserRequest request) {
        this.create(request, UserRole.ADMIN);
    }
}
