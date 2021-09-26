package dk.kea.adventureproject.repositories;

import dk.kea.adventureproject.models.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

        /**Author Kristian og Martin
        * Equipment repository med standard CRUD
        * Skal rettes til
        */
@Repository
public class EquipmentRepository {
    @Autowired
    JdbcTemplate template;

        /** Create new equipment item, linked til activityID
         * @param equipment
         */
    public void createEquipment(Equipment equipment) {
        String sql = "INSERT INTO tmp (activityID,activityName,minimumAge,minimumHeight,isWithAdult) VALUES(?,?,?,?,?)";
        template.update(sql,
                equipment.getEquipmentID(),
                equipment.getActivityID(),
                equipment.getEquipmentID(),
                equipment.getAmount());
    }

        /**
         * Read all equipment, finder alt equipment ud fra et activityID fra db
         * @return
         */
    public List<Equipment> readAllEquipmentById(){
        String sql = "SELECT * FROM tmp";
        RowMapper<Equipment> equipmentRowMapper = new BeanPropertyRowMapper<Equipment>(Equipment.class);
        return template.query(sql,equipmentRowMapper);
    }
        /** Update equipment by Id, opdatere et equipment ud fra activity id
        * @param equipment
        */
    public void updateEquipmentById(Equipment equipment){
        String sql = "UPDATE tmp SET activityName = ?,minimumAge = ?,minimumHeight = ?,isWithAdult = ?";
        template.update(sql,
                equipment.getEquipmentName(),
                equipment.getAmount());
    }

        /** Delete equipment ud fra id
         * @param equipment
         */
    public void deleteEquipmentById(Equipment equipment){
        String sql = "DELETE tmp WHERE activityID = ?";
        template.update(sql, equipment.getEquipmentID());
    }
}