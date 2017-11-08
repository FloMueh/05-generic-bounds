package de.fhro.inf.prg3.a05;

import de.fhro.inf.prg3.a05.collections.SimpleList;
import de.fhro.inf.prg3.a05.collections.SimpleListImpl;
import de.fhro.inf.prg3.a05.model.Plant;
import de.fhro.inf.prg3.a05.model.PlantColor;

public class PlantBed<T extends Plant> {
    private SimpleList<T> plantList;

    public PlantBed() {
        plantList = new SimpleListImpl<>();
    }

    public void add(T plant) {
        plantList.add(plant);
    }

    public int size() {
        return plantList.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
        return plantList.filter(item -> item.getColor().equals(color));
    }
}
