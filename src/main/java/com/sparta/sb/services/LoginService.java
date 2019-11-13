package com.sparta.sb.services;

import com.sparta.sb.components.User;

public class LoginService
{
    public String validateUser(User user)
    {
        if(user.getUserName().equals("simao") && user.getPassword().equals("password")) { return "welcome"; }
        return "login";
    }
}
