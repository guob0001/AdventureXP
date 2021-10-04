package dk.kea.adventureproject.models;


/**
 * @author Christian og Joachim
 */
public class Activity {
    private int activityID;
    private String activityName;
    private int ageLimit;
    private int heightLimit;
    private int timeLimit;
    private String description;

    public Activity() {
    }

    public Activity(int activityID, String activityName, int ageLimit, int heightLimit, int timeLimit, String description) {
        this.activityID = activityID;
        this.activityName = activityName;
        this.ageLimit = ageLimit;
        this.heightLimit = heightLimit;
        this.timeLimit = timeLimit;
        this.description = description;
    }


    public int getHeightLimit() {
        return heightLimit;
    }

    public void setHeightLimit(int heightLimit) {
        this.heightLimit = heightLimit;
    }

    public int getActivityID() {
        return activityID;
    }

    public void setActivityID(int activityID) {
        this.activityID = activityID;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
