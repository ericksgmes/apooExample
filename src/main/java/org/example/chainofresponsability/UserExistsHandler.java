package org.example.chainofresponsability;

public class UserExistsHandler extends Handler {
    private Database database;
    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handleRequest(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("User " + username + " is not valid");
            return false;
        }
        return handleNext(username, password);
    }
}
