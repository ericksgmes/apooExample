package org.example.chainofresponsability;

public class AuthService {
    private Handler handler;
    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        if (handler.handleRequest(username, password)) {
            System.out.println("Logged in");
            return true;
        }
        System.out.println("Not logged in");
        return false;
    }
}
