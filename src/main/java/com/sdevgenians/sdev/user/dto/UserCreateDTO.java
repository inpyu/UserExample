package com.sdevgenians.sdev.user.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserCreateDTO {

    private String email;
    private String password;

    @Builder
    public UserCreateDTO(String eamil, String password){
        this.email = getEmail();
        this.password = getPassword();
    }
}
