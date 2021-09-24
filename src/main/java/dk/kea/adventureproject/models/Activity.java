package dk.kea.adventureproject.models;

import java.time.LocalDateTime;

/**
 * @author Christian og Joachim
 */
public class Activity {

    private int activityID;
    private String activityName;
    private boolean isWithAdult;
    private int ageLimit;
    private int heightLimit;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private double timeLimit;

    public Activity(int activityID, String activityName, boolean isWithAdult, int ageLimit, int heightLimit,
                    LocalDateTime fromDate, LocalDateTime toDate, double timeLimit) {
        this.activityID = activityID;
        this.activityName = activityName;
        this.isWithAdult = isWithAdult;
        this.ageLimit = ageLimit;
        this.fromDate = fromDate;
        this.toDate = toDate;
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

    public boolean isWithAdult() {
        return isWithAdult;
    }

    public void setWithAdult(boolean withAdult) {
        isWithAdult = withAdult;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public double getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(double timeLimit) {
        this.timeLimit = timeLimit;
    }
}
