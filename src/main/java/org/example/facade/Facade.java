package org.example.facade;

public class Facade {
    public static void main(String[] args) {
        Interpretador interpretador = new Interpretador("john\ndoe");
        System.out.println(interpretador.eval());
    }
}
