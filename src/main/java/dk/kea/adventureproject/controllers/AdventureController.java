package dk.kea.adventureproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Julius Panduro
 */
@Controller
public class AdventureController {

    @GetMapping("/index")
    public String hello(){
        return "index.html";
    }

    @GetMapping("/activityOverview")
    public String hello2(){
        return "activityOverview.html";
    }
}
