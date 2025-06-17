package org.example.facade;

import java.util.Scanner;

public class Interpretador {
    private final String file;
    public Interpretador(String file) {
        this.file = file;
    }

    public String eval() {
        Scanner s = new Scanner(file);
        Parser p = new Parser(s);
        String parsed = p.parse();
        CodeGenerator code = new CodeGenerator(parsed);
        return code.eval();
    }
}
