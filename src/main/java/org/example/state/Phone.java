package org.example.state;


public class Phone {
    State state;
    public Phone() {
        state = new OffState(this);
    }
    public void setState(State state) {
        this.state = state;
    }

    public String getStateName() {
        return state.getClass().getSimpleName();
    }

    public String lock() {
        return "Locked screen";
    }

    public String unlock() {
        return "Unlocked screen";
    }

    public String home() {
        return "Home screen";
    }

    public String turnOn() {
        return "Turned on screen";
    }
}
