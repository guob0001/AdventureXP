package dk.kea.adventureproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daniel Westphal & Hans
 */
@Controller
public class AdventureController {

    @GetMapping("/index")
    public String index(){
        return "index.html";
    }

    @GetMapping("/activityOverview")
    public String activityOverview(){
        return "activityOverview.html";
    }

    @GetMapping("/activity{activityID}")
    public String activity(@PathVariable("activityID") int activityID, Model model){
        model.addAttribute("activityID", activityID);
        return "activity";
    }

}
