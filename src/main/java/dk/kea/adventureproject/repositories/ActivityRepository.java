package dk.kea.adventureproject.repositories;


import dk.kea.adventureproject.models.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Julius Panduro
 * @auther Frederik LP
 * @auther Alexander Stohn
 */

/**
 * Waiting for Activity model to be made before testing can be done.
 * Waiting for DB to be made before testing can be done.
 * tmp is just temporary until the right table for the database is made
 */

@Repository
public class ActivityRepository {

    @Autowired
    JdbcTemplate template;

    //TODO Change tmp With the right tablename for the database.

    public void createNewActivity(Activity activity) {
        String sql = "INSERT INTO tmp (activityID,activityName,minimumAge,minimumHeight,isWithAdult) VALUES(?,?,?,?,?)";
        template.update(sql,
                activity.getActivityID(),
                activity.getActivityName(),
                activity.getMinimumAge(),
                activity.getMinimumHeight(),
                activity.getIsWithAdult());

            //int activityID, String activityName, int minimumAge, int minimumHeight, boolean isWithAdult
    }

    public List<Activity> readAllActivities(){
        String sql = "SELECT * FROM tmp";
        RowMapper<Activity> activityRowMapper = new BeanPropertyRowMapper<Activity>(Activity.class);
        return template.query(sql,activityRowMapper);
    }

    public void updateActivity(Activity activity){
    String sql = "UPDATE tmp SET activityName = ?,minimumAge = ?,minimumHeight = ?,isWithAdult = ?";
    template.update(sql,
            activity.getActivityName(),
            activity.getMinimumAge(),
            activity.getMinimumHeight(),
            activity.getIsWithAdult());
    }

    public void deleteActivity(Activity activity){
        String sql = "DELETE tmp WHERE activityID = ?";
        template.update(sql, activity.getActivityID());
    }
}

