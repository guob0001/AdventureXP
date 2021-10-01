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

    /*
    Service skaber forbindelse til Repo, og gør at vi kan bruge metoderne i Repo klasse(r) */
    //Author Guobin Bruges til at kalde på ActivtyRepositorys "updateActivity" klasse, og opdaterer den activity med det pågældende ID
    public void updateActivity(Activity activity){
        activityRepository.updateActivity(activity);
    }

    //Author Guobin Får fremvist alle activities.
    public List<Activity> readAllActivities(){
        return activityRepository.readAllActivities();
    }

    //Viser én aktivitet ud fra ID
    public Activity readActivityByID(int activityID) {
        return activityRepository.readActivityByID(activityID);
    }

    //Author Guobin sletter activity via ID
    public void deleteActivity(int activityId){
        activityRepository.deleteActivity(activityId);
    }

    //Author Guobin opretter ny activity
    public void createNewActivity(Activity activity){
        activityRepository.createNewActivity(activity);
        System.out.println("This is Service");
    }

}