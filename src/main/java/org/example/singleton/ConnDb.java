package org.example.singleton;

public class ConnDb {
    private static ConnDb instance;

    private ConnDb() {}

    public static ConnDb getInstance() {
        if (instance == null) instance = new ConnDb();
        return instance;
    }
}
