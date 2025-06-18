package org.example.state;

public class OffState implements State {
    protected Phone phone;

    public OffState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String onHome() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }
}
