package com.ostapchuk.security.demo.rest;

import lombok.Data;

@Data
public class AuthenticationRequestDto {

    private String email;
    private String password;

}
