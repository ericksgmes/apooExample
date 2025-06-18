package org.example.factory;

public class StringToLowerCaseFormatter implements StringFormatter {
    @Override
    public String format(String str) {
        return str.toLowerCase();
    }
}
