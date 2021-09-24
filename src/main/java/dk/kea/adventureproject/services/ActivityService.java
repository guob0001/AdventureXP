package dk.kea.adventureproject.services;
import dk.kea.adventureproject.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {
    @Autowired
    ActivityRepository activityrepository;
    /*
    Service skaber forbindelse til Repo, og gør at vi kan bruge metoderne i Repo klasse(r) */
    //Author Guobin Bruges til at kalde på ActivtyRepositorys "updateActivity" klasse, og opdaterer den activity med det pågældende ID
    public Activity updateActivity(int activityId){
        return activityrepository.updateActivity(activityId);
    }
    //Author Guobin Får fremvist alle activities.
    public List<Activity> readAllActivities(){
        return ActivityRepository.readAllActivities();
    }
    //Author Guobin sletter activity via ID
    public boolean deleteActivity(int activityId){
        return ActivityRepository.deleteActivity(activityId);
    }
    //Author Guobin opretter ny activity
    public Activity createNewActivity(Activity a){
        return activityrepository.createNewActivity(a);
    }

}