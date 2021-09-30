package dk.kea.adventureproject.services;
import dk.kea.adventureproject.models.Booking;
import dk.kea.adventureproject.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public void createNewBooking(Booking booking){
        bookingRepository.createNewBooking(booking);
    }

    public List<Booking> readAllBookings(){
        return bookingRepository.readAllBookings();
    }

    public void updateBooking(Booking booking){
        bookingRepository.updateBooking(booking);
    }

    /**
     * @author Christian & Joachim
     * @param bookingId
     * @return
     */
    public Booking findBookingById(int bookingId) {
        return bookingRepository.readBookingByID(bookingId);
    }

    /*Øpublic Booking readBookingById(int bookingId) {
        return bookingRepository.readBookingById(bookingId);
    }*/
}
