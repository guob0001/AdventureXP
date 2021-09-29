package dk.kea.adventureproject.controllers;


import dk.kea.adventureproject.models.Booking;
import dk.kea.adventureproject.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Daniel Westphal & Hans
 */
@Controller
public class BookingController {

    @Autowired
    BookingService bookingServiceForController;

    @GetMapping("/createBooking")
    public String createBooking() {
        return "createBooking.html";
    }

    @PostMapping("/createBooking")
    public String createBooking(@ModelAttribute Booking booking, Model model) {
        bookingServiceForController.createNewBooking(booking);
        List<Booking> bookingList = bookingServiceForController.readAllBookings();
        model.addAttribute("booking", bookingList);
        return "createBooking.html";
    }
}
