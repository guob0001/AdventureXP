package dk.kea.adventureproject.models;

import java.util.Date;
/**
 * @author Martin og Kristian
 */

public class SearchBooking {
    private int bookingId;
    private int activityID;
    private String activityName;
    private String employeeName;
    private String customerName;
    private int customerTelephone;
    private String startDate;
    private String timeStart;
    private int timeLimit;

    public SearchBooking(){}
    public SearchBooking(int bookingId, int activityID, String activityName, String employeeName, String customerName, int customerTelephone, String startDate, String timeStart, int timeLimit) {
        this.bookingId = bookingId;
        this.activityID = activityID;
        this.activityName = activityName;
        this.employeeName = employeeName;
        this.customerName = customerName;
        this.customerTelephone = customerTelephone;
        this.startDate = startDate;
        this.timeStart = timeStart;
        this.timeLimit = timeLimit;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
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

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerTelephone() {
        return customerTelephone;
    }

    public void setCustomerTelephone(int customerTelephone) {
        this.customerTelephone = customerTelephone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }
}