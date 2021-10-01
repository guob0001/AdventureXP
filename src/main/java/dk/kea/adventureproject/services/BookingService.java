package dk.kea.adventureproject.services;

import dk.kea.adventureproject.models.Booking;
import dk.kea.adventureproject.models.SearchBooking;
import dk.kea.adventureproject.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public void createNewBooking(Booking booking) {
        bookingRepository.createNewBooking(booking);
    }

    public List<Booking> readAllBookings() {
        return bookingRepository.readAllBookings();
    }

    public void updateBooking(Booking booking) {
        bookingRepository.updateBooking(booking);
    }

    /**
     * @param bookingId
     * @return
     * @author Christian & Joachim
     */
    public Booking findBookingById(int bookingId) {
        return bookingRepository.readBookingByID(bookingId);
    }

    public List<SearchBooking> searchBooking(String bookingID, String activityID,
                                             String activityName, String employeeName, String customerName, String customerPhoneNumber, String startDate, String dateFrom, String dateTo) {
        return bookingRepository.searchBooking(bookingID, activityID, activityName, employeeName, customerName, customerPhoneNumber, startDate, dateFrom, dateTo);
    }

    /*Øpublic Booking readBookingById(int bookingId) {
        return bookingRepository.readBookingById(bookingId);
    }*/
    public void deleteBooking(int bookingId){
        bookingRepository.deleteBooking(bookingId);
    }
}
