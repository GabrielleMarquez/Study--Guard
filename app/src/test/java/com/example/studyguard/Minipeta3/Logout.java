package com.example.studyguard.Minipeta3;

import java.time.LocalDateTime;

public class Logout {

    private String username;
    private boolean loggedIn;
    private LocalDateTime logoutTime;

    public Logout(String username) {
        this.username = username;
        this.loggedIn = true;
    }

    public void logout() {
        loggedIn = false;
        logoutTime = LocalDateTime.now();

        System.out.println(username + " has logged out.");
        System.out.println("Logout time: " + logoutTime);
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public static void main(String[] args) {
        Logout session = new Logout("student01");

        session.logout();
    }
}