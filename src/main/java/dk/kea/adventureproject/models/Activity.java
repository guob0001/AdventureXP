package dk.kea.adventureproject.models;

import java.time.LocalDateTime;

/**
 * @author Christian og Joachim
 */
public class Activity {

    private int activityID;
    private String activityName;
    private boolean isWithParents;
    private int ageLimit;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private double timeLimit;

    public Activity(int activityID, String activityName, boolean isWithParents, int ageLimit,
                    LocalDateTime fromDate, LocalDateTime toDate, double timeLimit) {
        this.activityID = activityID;
        this.activityName = activityName;
        this.isWithParents = isWithParents;
        this.ageLimit = ageLimit;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.timeLimit = timeLimit;
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

    public boolean isWithParents() {
        return isWithParents;
    }

    public void setWithParents(boolean withParents) {
        isWithParents = withParents;
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
