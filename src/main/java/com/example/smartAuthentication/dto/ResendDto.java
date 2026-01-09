package com.example.smartAuthentication.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResendDto {

    private String email;

    public ResendDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
