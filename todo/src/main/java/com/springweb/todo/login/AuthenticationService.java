package com.springweb.todo.login;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {
    public boolean authenticate(String username,String password){
        boolean isValidUserName = username.equalsIgnoreCase("Hello");
        boolean isValidPassword = username.equalsIgnoreCase("Hello");
        return isValidPassword && isValidUserName;
    }
}
