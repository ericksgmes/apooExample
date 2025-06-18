package org.example.builder;

public class Builder {
    public static void main(String[] args) {
        Director director = new Director();
        GuitarBuilder guitarBuilder = new GuitarBuilder();
        director.buildElectricTagima(guitarBuilder);
        Guitar tagima = guitarBuilder.build();
        director.buildAcousticYamaha(guitarBuilder);
        Guitar yamaha = guitarBuilder.build();
        System.out.println(tagima.toString());
        System.out.println(yamaha.toString());
    }
}
