package com.example.studygaurd.Minipeta3;

import java.time.LocalDateTime;

public class Main {

    private String username;
    private boolean loggedIn;
    private LocalDateTime logoutTime;

    public Main(String username) {
        this.username = username;
        this.loggedIn = true;
    }

    public boolean logout() {
        if (!loggedIn) {
            System.out.println("No active session for " + username + ".");
            return false;
        }
        loggedIn = false;
        logoutTime = LocalDateTime.now();
        System.out.println("Goodbye, " + username + "! Logged out at " + logoutTime);
        return true;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public static void main(String[] args) {
        Main session = new Main("student01");
        session.logout();
        session.logout();
    }
}
