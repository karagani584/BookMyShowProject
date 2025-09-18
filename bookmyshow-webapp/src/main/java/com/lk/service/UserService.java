package com.lk.service;

import com.lk.dto.*;

public interface UserService {
    SignupUserResponseDto signup(SignupUserRequestDto request);
    LoginResponseDto login(LoginRequestDto request);
}
