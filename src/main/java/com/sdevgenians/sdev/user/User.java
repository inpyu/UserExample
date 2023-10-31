package com.sdevgenians.sdev.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="USER_TABLE")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Builder
    public User (Long id, String email, String password){
        this.id = id;
        this.email = email;
        this.password = password;
    }

}
