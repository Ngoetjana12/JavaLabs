package org.example;

public class LoginCheck {

    String username;
    String password;

    public LoginCheck(String username, String password){

        this.username = username;
        this.password = password;
    }

    public boolean isValidated(String checkedUsername, String checkedPassword){

        return checkedUsername.equals(username) && checkedPassword.equals(password);
    }
}
