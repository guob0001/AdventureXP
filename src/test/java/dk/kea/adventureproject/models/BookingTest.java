package dk.kea.adventureproject.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {


    /**
     * @author Joachim og Christian
     */
    @Test
    void booking() {

        Booking booking = new Booking(1, 2, "Sven Sved", "Lone Dorthe", 88888888, "1 Nov 2021", "2 Nov 2021");

        assertEquals(1, booking.getBookingId());
        assertEquals(2, booking.getActivityID());
        assertEquals("Sven Sved", booking.getEmployeeName());
        assertEquals("Lone Dorthe", booking.getCustomerName());
        assertEquals(88888888, booking.getCustomerTelephone());
        assertEquals("1 Nov 2021", booking.getStartDate());
        assertEquals("2 Nov 2021", booking.getTimeStart());
    }
}