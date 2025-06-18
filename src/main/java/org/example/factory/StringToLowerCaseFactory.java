package org.example.factory;

public class StringToLowerCaseFactory extends StringToFactory {
    @Override
    protected StringFormatter stringFormatter() {
        return new StringToLowerCaseFormatter();
    }
}
