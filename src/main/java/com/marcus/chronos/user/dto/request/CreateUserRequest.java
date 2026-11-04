package com.marcus.chronos.user.dto.request;

public record CreateUserRequest(
        String name,
        String password
) {
}
