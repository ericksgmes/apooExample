package org.example.chainofresponsability;

public class ValidPasswordHandler extends Handler {
    private Database database;
    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handleRequest(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Wrong password");
            return false;
        }
        return handleNext(username, password);
    }
}
