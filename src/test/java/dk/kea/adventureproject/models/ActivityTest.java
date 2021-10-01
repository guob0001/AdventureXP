package dk.kea.adventureproject.models;

import dk.kea.adventureproject.models.Activity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActivityTest {

    /**
     * @author Joachim
     * @author Christian
     */

    @Test
    void Activity() {

        Activity activity = new Activity(1, "Sumo", 18, 150, 100, "Socks");

        assertEquals(18, activity.getAgeLimit());
        assertEquals(150, activity.getHeightLimit());
        assertEquals(1, activity.getActivityID());
        assertEquals("Sumo", activity.getActivityName());
        assertEquals(100, activity.getTimeLimit());
        assertEquals("Socks", activity.getDescription());
    }
}