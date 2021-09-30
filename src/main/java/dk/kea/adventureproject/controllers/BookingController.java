package dk.kea.adventureproject.controllers;


import dk.kea.adventureproject.models.Booking;
import dk.kea.adventureproject.models.SearchBooking;
import dk.kea.adventureproject.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Daniel Westphal & Hans
 */
@Controller
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/createBooking")
    public String createBooking() {
        return "createBooking.html";
    }

    @PostMapping("/createBooking")
    public String createBooking(@ModelAttribute Booking booking, Model model) {
        bookingService.createNewBooking(booking);
        List<Booking> bookingList = bookingService.readAllBookings();
        model.addAttribute("booking", bookingList);
        return "createBooking.html";
    }

    /**
     * @author Christian & Joachim
     * @param bookingID
     * @param model
     * @return
     */
    @GetMapping("/updateBooking/{bookingID}")
    public String updateBooking(@PathVariable int bookingID, Model model) {
        model.addAttribute("booking", bookingServiceForController.findBookingById(bookingID));
        return "updateBooking";
    }

    @PostMapping("/updateBooking")
    public String updateBooking(@ModelAttribute Booking booking) {
        bookingServiceForController.updateBooking(booking);
        return "redirect:/bookingIndex";
    }


    @GetMapping("/searchBooking")
    public String searchBooking() {
        return "/searchBooking";
    }

    @PostMapping("/searchBooking")
    public String searchBooking(@RequestParam(value = "bookingID", required = false) String bookingID,
    @RequestParam(value = "activityID", required = false) String activityID,
    @RequestParam(value = "activityName", required = false) String activityName,
    @RequestParam(value = "employeeName", required = false) String employeeName,
    @RequestParam(value = "customerName", required = false) String customerName,
    @RequestParam(value = "customerPhoneNumber", required = false) String customerPhoneNumber,
    @RequestParam(value = "startDate", required = false) String startDate,
    @RequestParam(value = "dateFrom", required = false) String dateFrom,
    @RequestParam(value = "dateTo", required = false) String dateTo,
    Model model) {
    List<SearchBooking> bookingList = bookingService.searchBooking(bookingID, activityID,
    activityName, employeeName, customerName, customerPhoneNumber, startDate, dateFrom, dateTo);
    model.addAttribute("bookingList", bookingList);
    return "/searchBooking";
    }

}
