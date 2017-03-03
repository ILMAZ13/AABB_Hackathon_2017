package ru.hackathon.aabb.advancedakbarsbank.model.service;

public class AuthorizationPlug {
    public boolean authorize(String login, String password) {
        if (login.equals("Admin") && password.equals("123")) {
            return true;
        } else {
            return false;
        }
    }
}
