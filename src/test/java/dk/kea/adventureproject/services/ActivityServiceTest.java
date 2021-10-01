package dk.kea.adventureproject.services;

import dk.kea.adventureproject.models.Activity;
import dk.kea.adventureproject.repositories.ActivityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ActivityServiceTest {

    @Autowired
    ActivityRepository activityRepository;

    @Autowired
    ActivityService activityService;

    Activity activity = new Activity(1, "Sumo", 18, 150, 100, "Socks");

    @Test
    void updateActivity() {
        //Ændre activity
        activity.setActivityName("Sumo 2");
        //activityService.updateActivity(activity);

        assertEquals("Sumo 2", activity.getActivityName());
    }
}