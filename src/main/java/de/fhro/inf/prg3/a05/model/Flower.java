package de.fhro.inf.prg3.a05.model;

public class Flower extends Plant {
    public PlantColor color;

    public Flower(PlantColor color, double height, String family, String name) {
        super(height, family, name);
        if(color == PlantColor.GREEN)
            throw new IllegalArgumentException("Grün nicht erlaubt");
        else
            this.color = color;
    }

    @Override
    public PlantColor getColor() {
        return this.color;
    }
}
