package dk.kea.adventureproject.models;




/**Author Kristian og Martin
 * Equipment model med fields, getters and setters og contructors
 */
public class Equipment {
    private int equipmentID;
    private int activityID;
    private String equipmentName;
    private int amount;

    public Equipment() {
    }

    public Equipment(int equipmentID, int activityID, String equipmentName, int amount) {
        this.equipmentID = equipmentID;
        this.activityID = activityID;
        this.equipmentName = equipmentName;
        this.amount = amount;
    }

    public int getEquipmentID() { return equipmentID; }

    public void setEquipmentID(int equipmentID) { this.equipmentID = equipmentID; }

    public int getActivityID() { return activityID; }

    public void setActivityID(int activityID) { this.activityID = activityID; }

    public String getEquipmentName() { return equipmentName; }

    public void setEquipmentName(String equipmentName) { this.equipmentName = equipmentName; }

    public int getAmount() { return amount; }

    public void setAmount(int amount) { this.amount = amount; }
}