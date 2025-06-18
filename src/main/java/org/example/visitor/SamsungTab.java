package org.example.visitor;

public class SamsungTab extends Tablet {
    SamsungTab(String size, String year) {
        super(size, year);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
