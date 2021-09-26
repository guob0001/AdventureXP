package dk.kea.adventureproject.services;
import dk.kea.adventureproject.models.Activity;
import dk.kea.adventureproject.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActivityService {
    @Autowired
    ActivityRepository activityrepository;

    //Service skaber forbindelse til Repo, og gør at vi kan bruge metoderne i Repo klasse(r) */
    //Author Guobin/Oliver Bruges til at kalde på ActivtyRepositorys "updateActivity" klasse, og opdaterer den activity med det pågældende ID
    public void updateActivity(Activity activity){
        activityrepository.updateActivity(activity);
    }
    //Author Guobin/Oliver Får fremvist alle activities.
    public List<Activity> readAllActivities(){
        return activityrepository.readAllActivities();
    }
    //Author Guobin/Oliver sletter activity via ID
    public void deleteActivity(Activity activity){
        activityrepository.deleteActivity(activity);
    }
    //Author Guobin/Oliver opretter ny activity
    public void createNewActivity(Activity a){
        activityrepository.createNewActivity(a);
    }
}