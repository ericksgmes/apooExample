package org.example.strategy;

public class AttackMelee implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Attacking Melee");
    }
}
