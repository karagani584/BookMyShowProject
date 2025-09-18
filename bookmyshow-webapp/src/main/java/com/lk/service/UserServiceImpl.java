package com.lk.service;

import com.lk.dto.*;
import com.lk.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    private final Map<String, User> userStore = new HashMap<>();
    private Long idCounter = 1L;

    @Override
    public SignupUserResponseDto signup(SignupUserRequestDto request) {
        if (userStore.containsKey(request.getEmail())) {
            return new SignupUserResponseDto(false, "User already exists", null, null, null);
        }

        User newUser = new User(idCounter++, request.getName(), request.getEmail(), request.getPassword());
        userStore.put(newUser.getEmail(), newUser);

        return new SignupUserResponseDto(true, "Signup successful", newUser.getUserId(), newUser.getName(), newUser.getEmail());
    }

    @Override
    public LoginResponseDto login(LoginRequestDto request) {
        User user = userStore.get(request.getEmail());
        if (user == null) {
            return new LoginResponseDto(false, "User not found", null);
        }

        if (!user.getPassword().equals(request.getPassword())) {
            return new LoginResponseDto(false, "Invalid password", null);
        }

        return new LoginResponseDto(true, "Login successful", user.getUserId());
    }
}
