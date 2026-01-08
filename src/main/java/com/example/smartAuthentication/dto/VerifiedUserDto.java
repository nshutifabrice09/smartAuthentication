package com.example.smartAuthentication.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerifiedUserDto {

    private String email;
    private String verificationCode;
}
