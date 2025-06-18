package org.example.builder;

public class GuitarBuilder {
    private int id;
    private String brand;
    private String model;
    private String color;
    private int numPickups;

    public GuitarBuilder id(int id) {
        this.id = id;
        return this;
    }

    public GuitarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public GuitarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public GuitarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public GuitarBuilder numPickups(int numPickups) {
        this.numPickups = numPickups;
        return this;
    }

    public Guitar build() {
        return new Guitar(id, brand, model, color, numPickups);
    }
}
