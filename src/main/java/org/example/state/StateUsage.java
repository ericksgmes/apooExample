package org.example.state;

public class StateUsage {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println("Estado inicial: " + phone.getStateName());

        String res1 = phone.state.onHome();
        System.out.println("Ação Power: " + res1);
        System.out.println("Estado agora: " + phone.getStateName());

        String res2 = phone.state.onHome();
        System.out.println("Ação Home: " + res2);
        System.out.println("Estado agora: " + phone.getStateName());

        String res3 = phone.state.onOffOn();
        System.out.println("Ação Power novamente: " + res3);
        System.out.println("Estado agora: " + phone.getStateName());
    }

}
