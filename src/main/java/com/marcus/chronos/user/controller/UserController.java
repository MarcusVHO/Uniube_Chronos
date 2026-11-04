package com.marcus.chronos.user.controller;

import com.marcus.chronos.user.dto.request.CreateUserRequest;
import com.marcus.chronos.user.service.CreateUserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final CreateUserService createUserService;

    public UserController(CreateUserService createUserService) {
        this.createUserService = createUserService;
    }

    @PostMapping("/estudante")
    public ResponseEntity<Void> createUserEstudante(
            @Valid @RequestBody CreateUserRequest request
    ) {
        createUserService.createDocente(request);
        return ResponseEntity.ok().build();
    }
}
