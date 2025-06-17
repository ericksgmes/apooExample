package org.example.singleton;

public class Singleton {
    public static void main(String[] args) {
        ConnDb connDb = ConnDb.getInstance();
        System.out.println(connDb);
        ConnDb connDb2 = ConnDb.getInstance();
        System.out.println(connDb2);
    }
}
