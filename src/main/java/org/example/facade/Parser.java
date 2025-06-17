package org.example.facade;

import java.util.Scanner;

public class Parser {
    private final Scanner raw;
    public Parser(Scanner raw) {
        this.raw = raw;
    }

    public String parse(){
        StringBuilder resp = new StringBuilder();
        if (raw.hasNextLine()) {
            resp.append(raw.nextLine());
            while (raw.hasNextLine()) {
                resp.append("\n").append(raw.nextLine());
            }
        }
        return resp.toString().replace("\n", ";");
    }
}
