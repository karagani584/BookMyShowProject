package com.lk.dto;

public class LoginResponseDto extends ResponseStatus {
    private Long userId;

    public LoginResponseDto() {}

    public LoginResponseDto(boolean success, String message, Long userId) {
        super(success, message);
        this.userId = userId;
    }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}
