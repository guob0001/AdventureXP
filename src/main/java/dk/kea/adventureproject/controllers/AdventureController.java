package dk.kea.adventureproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/paintball")
    public String paintball(){
        return "paintball.html";
    }

    @GetMapping("/gocart")
    public String gocart(){
        return "gocart.html";
    }

    @GetMapping("/minigolf")
    public String minigolf(){
        return "minigolf.html";
    }

    @GetMapping("/sumo")
    public String sumo(){
        return "sumo.html";
    }

    @GetMapping("/create")
    public String create(){
        return "create.html";
    }

    @GetMapping("/activityOverview")
    public String activityOverview(){
        return "activityOverview.html";
    }


    @GetMapping("/activity/{activityID}")
    public String activity(@PathVariable("activityID") int activityID, Model model){
        model.addAttribute("activityID", activityID);
        return "activity";
    }

    @GetMapping("/deleteActivity")

    @PostMapping("/activity/{activityID}")
    public String activityRemove(@PathVariable("activityID") int activityID){
        return "delete not complete";
    }




}
