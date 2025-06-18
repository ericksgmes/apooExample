package org.example.factory;

public class StringToUpperCaseFormatter implements StringFormatter {
    @Override
    public String format(String str) {
        return str.toUpperCase();
    }
}
