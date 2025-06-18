package org.example.factory;

public class StringToCapitalizedFactory extends StringToFactory {
    @Override
    protected StringFormatter stringFormatter() {
        return new StringToCapitalizedFormatter();
    }
}
