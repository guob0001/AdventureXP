package dk.kea.adventureproject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Daniel Westphal & Hans
 */
@Controller
public class BookingController {

    @PostMapping("/createNewBooking")
    public String createNewBooking()  {
        return "createNewBooking.html";
    }

}
