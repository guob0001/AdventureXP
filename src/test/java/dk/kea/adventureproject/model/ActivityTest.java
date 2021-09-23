package dk.kea.adventureproject.model;

import dk.kea.adventureproject.models.Activity;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ActivityTest {

    /**
     * @author Joachim
     * @author Christian
     */

    @Test
    void Activity() {

        LocalDateTime fromDate = LocalDateTime.of(2021, 9, 24, 19, 30);
        LocalDateTime toDate = LocalDateTime.of(2021, 9, 24, 20, 30);

        Activity activity = new Activity(1, "Sumo", 18, fromDate, toDate, 100);

        activity.setAge(18);
        assertTrue(activity.getAge().matches(18));

        activity.setId(1);
        assertTrue(activity.getId().matches(1));

        activity.setName("Sumo");
        assertEquals("Sumo"), activity.getName();

        activity.setTimeLimit(100);
        assertEquals(100), activity.getTimeLimit();

        activity.setFromDate("2021-09-24T19:30");
        assertEquals(LocalDateTime.of(2021, 9, 24, 19, 30), activity.getFromDate());

        activity.setToDate("2021-09-24T20:30");
        assertEquals(LocalDateTime.of(2021, 9, 24, 20, 30), activity.getSetToDate());

    }

}
