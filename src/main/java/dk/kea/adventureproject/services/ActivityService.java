package dk.kea.adventureproject.services;
import dk.kea.adventureproject.models.Activity;
import dk.kea.adventureproject.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    ActivityRepository activityRepository;

    public void updateActivity(int activityID, Activity activity){
        activityRepository.updateActivity(activityID, activity);
    }

    public List<Activity> readAllActivities(){
        return activityRepository.readAllActivities();
    }

    public Activity readActivityByID(int activityID) {
        return activityRepository.readActivityByID(activityID);
    }

    public void deleteActivity(int activityId){
        activityRepository.deleteActivity(activityId);
    }

    public void createNewActivity(Activity activity){
        activityRepository.createNewActivity(activity);
        System.out.println("This is Service");
    }

}