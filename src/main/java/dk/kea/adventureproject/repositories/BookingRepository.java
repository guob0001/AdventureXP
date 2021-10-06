package dk.kea.adventureproject.repositories;

import dk.kea.adventureproject.models.Activity;
import dk.kea.adventureproject.models.Booking;
import dk.kea.adventureproject.models.SearchBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookingRepository {

    @Autowired
    JdbcTemplate template;

    public void createNewBooking(Booking booking) {
        String sql = "INSERT INTO booking (activityID, employeeName, customerName, customerTelephone, startDate, timeStart) VALUES(?, ?, ?, ?, ?, ?)";
        template.update(sql,
                booking.getActivityID(),
                booking.getEmployeeName(),
                booking.getCustomerName(),
                booking.getCustomerTelephone(),
                booking.getStartDate(),
                booking.getTimeStart());
    }

    public List<Booking> readAllBookings() {
        String sql = "SELECT * FROM booking";
        RowMapper<Booking> bookingRowMapper = new BeanPropertyRowMapper<>(Booking.class);
        return template.query(sql, bookingRowMapper);
    }

    public Booking readBookingByID(int bookingId) {
        String sql = "SELECT * FROM booking WHERE bookingId = ?";
        RowMapper<Booking> rowMapper = new BeanPropertyRowMapper<>(Booking.class);
        return template.queryForObject(sql, rowMapper, bookingId);
    }

    public void updateBooking(Booking booking) {
        String updateSql = "UPDATE booking SET activityID = ?, employeeName = ?, customerName = ?, customerTelephone = ?, startDate = ?, timeStart = ? WHERE bookingID = ?";
        template.update(updateSql,
                booking.getActivityID(),
                booking.getEmployeeName(),
                booking.getCustomerName(),
                booking.getCustomerTelephone(),
                booking.getStartDate(),
                booking.getTimeStart(),
                booking.getBookingId());
    }

    public List<SearchBooking> searchBooking(String BookingID, String activityID,
     String activityName, String employeeName, String customerName,
                                             String customerPhoneNumber,
                                             String startDate, String dateFrom, String dateTo) {
        String sql = "CALL searchBooking (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        RowMapper rowMapper = new BeanPropertyRowMapper(SearchBooking.class);
        return template.query(sql, rowMapper, BookingID, activityID,
                activityName, employeeName, customerName, customerPhoneNumber, startDate, dateFrom, dateTo);
    }

    public void deleteBooking(int bookingId) {
        String sql = "DELETE FROM booking WHERE bookingId = ?";
        template.update(sql, bookingId);
    }
}
