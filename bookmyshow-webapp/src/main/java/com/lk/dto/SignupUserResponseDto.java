package com.lk.dto;

public class SignupUserResponseDto extends ResponseStatus {
    private Long userId;
    private String name;
    private String email;

    public SignupUserResponseDto() {}

    public SignupUserResponseDto(boolean success, String message, Long userId, String name, String email) {
        super(success, message);
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
