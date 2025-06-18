package org.example.visitor;


public abstract class Tablet {
    private final String size;
    private final String year;

    public Tablet(String size, String year) {
        this.size = size;
        this.year = year;
    }

    public String getYear() { return year; }

    public abstract void accept(Visitor visitor);
}
