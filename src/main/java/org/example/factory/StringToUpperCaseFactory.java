package org.example.factory;

public class StringToUpperCaseFactory extends StringToFactory {

    @Override
    protected StringFormatter stringFormatter() {
        return new StringToUpperCaseFormatter();
    }
}
