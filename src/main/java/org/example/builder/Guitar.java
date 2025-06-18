package org.example.builder;

public class Guitar {
    private int id;
    private String brand;
    private String model;
    private String color;
    private int numPickups;

    Guitar(int id, String brand, String model, String color, int numPickups) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numPickups = numPickups;
    }

    @Override
    public String toString() {
        return String.format(
                "Guitar{id=%d, brand='%s', model='%s', color='%s', numPickups=%d}",
                id, brand, model, color, numPickups
        );
    }
}
