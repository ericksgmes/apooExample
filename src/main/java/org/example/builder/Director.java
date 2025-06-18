package org.example.builder;

public class Director {
    public void buildAcousticYamaha(GuitarBuilder guitarBuilder) {
        guitarBuilder.brand("Yamaha")
                .model("F310")
                .color("Natural")
                .numPickups(0)
                .build();
    }

    public void buildElectricTagima(GuitarBuilder guitarBuilder) {
        guitarBuilder.brand("Tagima")
                .model("TG510")
                .color("Black")
                .numPickups(3)
                .build();
    }
}
