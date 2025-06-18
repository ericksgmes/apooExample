package org.example.chainofresponsability;

public class CoR {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database));
        AuthService service = new AuthService(handler);
        System.out.println("=====================================");
        service.logIn("admin", "admin");
        System.out.println("=====================================");
        service.logIn("UserJohn", "admin");
        System.out.println("=====================================");
        service.logIn("UserJohn", "PassJohn");
        System.out.println("=====================================");
    }
}
