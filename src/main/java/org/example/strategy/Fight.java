package org.example.strategy;

public class Fight {
    private AttackStrategy strategy;

    public Fight(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void fight() {
        strategy.attack();
    }
}
