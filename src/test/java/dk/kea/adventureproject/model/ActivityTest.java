package dk.kea.adventureproject.model;

import dk.kea.adventureproject.models.Activity;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActivityTest {

    /**
     * @author Joachim
     */

    @Test
    void Activity() {

        LocalDateTime fromDate = LocalDateTime.of(2021, 9, 24, 19, 30);
        LocalDateTime toDate = LocalDateTime.of(2021, 9, 24, 20, 30);

        Activity activity = new Activity(1, "Sumo", false, 18, fromDate, toDate, 100);

        assertEquals(18, activity.getAgeLimit());
        assertEquals(1, activity.getActivityID());
        assertEquals("Sumo", activity.getActivityName());
        assertEquals(false, activity.isWithParents());
        assertEquals(100, activity.getTimeLimit());
        assertEquals(LocalDateTime.of(2021, 9, 24, 19, 30), activity.getFromDate());
        assertEquals(LocalDateTime.of(2021, 9, 24, 20, 30), activity.getToDate());

    }

}
