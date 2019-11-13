package com.sparta.sb.services;

import com.sparta.sb.components.User;

import javax.ejb.Stateless;
import javax.inject.Named;

@Named
//@Stateless
public class RegistrationService {
    public String registerUser(User user)
    {
        return "login";
    }

}

