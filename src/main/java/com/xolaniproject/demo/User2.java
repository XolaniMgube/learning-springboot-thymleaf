package com.xolaniproject.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.beans.ConstructorProperties;

@Getter
@Setter
@ToString

public class User2 {
    private String userName;
    private String email;
    private String role;
    public User2 (String userName, String email, String role) {
        super();
        this.userName = userName;
        this.email = email;
        this.role = role;
    }
}
