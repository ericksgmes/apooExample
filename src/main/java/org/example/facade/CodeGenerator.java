package org.example.facade;

public class CodeGenerator {
    private final String ast;

    CodeGenerator(
            String ast
    ) {
        this.ast = ast;
    }

    public String eval(){
        // eval code
        return this.ast.toUpperCase();
    }
}
