package dk.kea.adventureproject.models;

/**
 * @author Christian og Joachim
 */

public class Activity {

    private int activityID;
    private String activityName;
    private int ageLimit;
    private int heightLimit;
    private double timeLimit;

    public Activity(int activityID, String activityName, int ageLimit, int heightLimit, double timeLimit) {
        this.activityID = activityID;
        this.activityName = activityName;
        this.ageLimit = ageLimit;
        this.timeLimit = timeLimit;
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

    public double getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(double timeLimit) {
        this.timeLimit = timeLimit;
    }
}
