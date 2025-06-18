package org.example.strategy;

public class Strategy {
    public static void main(String[] args) {
        AttackStrategy ranged = new AttackRanged();
        AttackStrategy melee = new AttackMelee();

        System.out.println("=== Iniciando cena de luta com ataque à distância ===");
        Fight scene1 = new Fight(ranged);
        System.out.println("Executando fight() com AttackRanged:");
        scene1.fight();

        System.out.println(); // linha em branco para separar
        System.out.println("=== Mudando estratégia para ataque corpo a corpo ===");
        scene1.setStrategy(melee);
        System.out.println("Executando fight() com AttackMelee:");
        scene1.fight();

        System.out.println("=== Fim da demonstração de Strategy Pattern ===");
    }

}
