package dk.kea.adventureproject.models;

import dk.kea.adventureproject.models.Equipment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SearchBookingTest {
    /** @Author Guobin & Alexander*/
    @Test
    void searchBookingTest() {

        SearchBooking searchBooking = new SearchBooking(1, 1, "Mogens", "Bob", "Ole", 123123123, "22-02-2020", "12:00", 3);

        assertEquals(1, searchBooking.getBookingId());
        assertEquals(1, searchBooking.getActivityID());
        assertEquals("Mogens", searchBooking.getActivityName());
        assertEquals("Bob", searchBooking.getEmployeeName());
        assertEquals("Ole", searchBooking.getCustomerName());
        assertEquals(123123123, searchBooking.getCustomerTelephone());
        assertEquals("22-02-2020", searchBooking.getStartDate());
        assertEquals("12:00", searchBooking.getTimeStart());
        assertEquals(3, searchBooking.getTimeLimit());

    }
}