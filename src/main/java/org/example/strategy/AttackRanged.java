package org.example.strategy;

public class AttackRanged implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Attacking Ranged");
    }
}
