package de.fhro.inf.prg3.a05.tests;

import de.fhro.inf.prg3.a05.PlantBed;
import de.fhro.inf.prg3.a05.PlantBedUtility;
import de.fhro.inf.prg3.a05.collections.SimpleList;
import de.fhro.inf.prg3.a05.collections.SimpleListImpl;
import de.fhro.inf.prg3.a05.model.Flower;
import de.fhro.inf.prg3.a05.model.Plant;
import de.fhro.inf.prg3.a05.model.PlantColor;
import de.fhro.inf.prg3.a05.model.Shrub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PlantBedTest {
    private final Logger logger = LogManager.getLogger();
    private PlantBed<Plant> testList;

    @BeforeEach
    void setup(){
        testList = new PlantBed<>();

        testList.add(new Flower(PlantColor.YELLOW, 12, "Family1", "Gänseblümchen"));
        testList.add(new Flower(PlantColor.RED, 13, "Family2", "Rose"));
        testList.add(new Flower(PlantColor.YELLOW, 14, "Family3", "Tulpe"));
        testList.add(new Shrub(15, "Family4", "Shrub_one"));
        testList.add(new Shrub(16, "Family5", "Shrub_two"));

    }

    @Test
    void testFlowerBedSize(){
        assertTrue(testList.size() == 5);
    }

    @Test
    void testFlowerWithWrongColor(){
        assertThrows(IllegalArgumentException.class,  () -> {
            new Flower(PlantColor.GREEN, 12, "test", "test");
        });
    }

    @Test
    void testAddPlantToPlantBed() {
        assertTrue(testList.size() == 5);
        testList.add(new Flower(PlantColor.YELLOW, 34, "test", "abc"));
        assertTrue(testList.size() == 6);
    }

    @Test
    void testFilterPlantBed() {
        assertTrue(testList.getPlantsByColor(PlantColor.YELLOW).size() == 2);
    }
}
