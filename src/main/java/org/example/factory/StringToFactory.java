package org.example.factory;

public abstract class StringToFactory {
    public String export(String string) {
        StringFormatter formatter = stringFormatter();
        return formatter.format(string);
    }

    protected abstract StringFormatter stringFormatter();
}
