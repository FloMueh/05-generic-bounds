package de.fhro.inf.prg3.a05.model;

public abstract class Plant implements Comparable {
    private double height;
    private String family;
    private String name;

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;

    }

    protected Plant(double height, String family, String name) {
        this.height = height;
        this.family = family;
        this.name = name;
    }

    public abstract PlantColor getColor();

    @Override
    public int compareTo(Object o) {
        Plant other = (Plant)o;
        if(other == this)
            return 0;

        if(other.getHeight() > this.getHeight())
            return 1;
        else if(other.getHeight() < this.getHeight())
            return -1;
        else
            return 0;
    }
}
