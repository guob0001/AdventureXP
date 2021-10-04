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

    public void createNewActivity(Activity activity) {
        String sql = "INSERT INTO activities (activityID, activityName, ageLimit, heightLimit, timeLimit, description) VALUES(?,?,?,?,?,?)";
        template.update(sql,
                activity.getActivityID(),
                activity.getActivityName(),
                activity.getAgeLimit(),
                activity.getHeightLimit(),
                activity.getTimeLimit(),
                activity.getDescription());
        System.out.println("This is repository");
        //int activityID, String activityName, int ageLimit, int minimumHeight, boolean isWithAdult
    }

    public List<Activity> readAllActivities() {
        String sql = "SELECT * FROM activities";
        RowMapper<Activity> activityRowMapper = new BeanPropertyRowMapper<>(Activity.class);
        return template.query(sql, activityRowMapper);
    }

    public Activity readActivityByID(int activityID) {
        String sql = "SELECT * FROM activities WHERE activityID = ?";
        RowMapper<Activity> rowMapper = new BeanPropertyRowMapper<>(Activity.class);
        return template.queryForObject(sql, rowMapper, activityID);
    }

    public void updateActivity(int activityID, Activity activity) {
        String sql = "UPDATE activities SET activityName = ?, ageLimit = ?, heightLimit = ?, timeLimit = ?, description = ? WHERE activityID = ?";
        template.update(sql,
                activity.getActivityName(),
                activity.getAgeLimit(),
                activity.getHeightLimit(),
                activity.getTimeLimit(),
                activity.getDescription(),
                activityID);
    }

    public void deleteActivity(int activityID) {
        String sql = "DELETE FROM activities WHERE activityID = ?";
        template.update(sql, activityID);
    }

}