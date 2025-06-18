package org.example.state;

public class ReadyState implements State {
    protected Phone phone;

    public ReadyState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String onHome() {
        return phone.home();
    }

    @Override
    public String onOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
