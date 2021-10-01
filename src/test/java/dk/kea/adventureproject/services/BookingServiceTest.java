package dk.kea.adventureproject.services;

import dk.kea.adventureproject.models.Booking;
import dk.kea.adventureproject.repositories.BookingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookingServiceTest {

    @Autowired
    BookingService bookingService;

    @Autowired
    BookingRepository bookingRepository;

    Booking booking = new Booking(1, 2, "Hans", "Jørgen", 22222222, "2021-06-12", "13");

    @Test
    void updateBooking() {
        booking.setCustomerTelephone(33333333);
        bookingService.updateBooking(booking);
    }
}