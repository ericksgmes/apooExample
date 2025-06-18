package org.example.chainofresponsability;

public abstract class Handler {
    private Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return this;
    }

    public abstract boolean handleRequest(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handleRequest(username, password);
    }
}
