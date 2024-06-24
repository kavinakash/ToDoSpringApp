package com.kavin.spring.todoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){
        boolean isValidUN = username.equalsIgnoreCase("administrator");
        boolean isValidPD = password.equalsIgnoreCase("admin");

        return isValidUN && isValidPD;
    }
}
