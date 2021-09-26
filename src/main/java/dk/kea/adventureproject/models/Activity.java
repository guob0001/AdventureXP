package dk.kea.adventureproject.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Christian og Joachim
 */
@Entity
public class Activity {

    @Id
    private int activityID;

    private String activityName;
    private int ageLimit;
    private int heightLimit;
    private double timeLimit;
    private boolean isWithAdult;

    public Activity() {
    }

    public Activity(int activityID, String activityName, int ageLimit, int heightLimit, double timeLimit, boolean isWithAdult) {
        this.activityID = activityID;
        this.activityName = activityName;
        this.ageLimit = ageLimit;
        this.timeLimit = timeLimit;
        this.isWithAdult = isWithAdult;
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

    public boolean getIsWithAdult() {return isWithAdult;}

    public void setIsWithAdult(boolean isWithAdult) {this.isWithAdult = isWithAdult;}
}
