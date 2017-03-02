package ru.hackathon.aabb.advancedakbarsbank.model.service;

public class AuthorizationPlug {
    public boolean authorizeByData(String login, String password) {
        if (login.equals("Admin") && password.equals("123")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean authorizeByCode(String code) {
        if (Integer.parseInt(code) == 00000) {
            return true;
        } else {
            return false;
        }
    }

}
