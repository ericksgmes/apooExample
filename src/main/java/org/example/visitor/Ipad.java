package org.example.visitor;

public class Ipad extends Tablet {
    public Ipad(String size, String year) {
        super(size, year);
    }

    public String getYear() {
        return super.getYear();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
