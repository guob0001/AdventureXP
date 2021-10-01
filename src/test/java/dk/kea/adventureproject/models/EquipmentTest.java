package dk.kea.adventureproject.models;

import dk.kea.adventureproject.models.Equipment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EquipmentTest {

    @Test
    void equipmentTest() {

        Equipment equipment = new Equipment(1, 1, "Sachel", 2);

        assertEquals(1, equipment.getEquipmentID());
        assertEquals(1, equipment.getActivityID());
        assertEquals("Sachel", equipment.getEquipmentName());
        assertEquals(2, equipment.getAmount());
    }
}
