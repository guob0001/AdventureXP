package dk.kea.adventureproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Julius Panduro
 */
@RestController
public class AdventureController {

    @GetMapping("/hej")
    public String hello(){
        return "Hello world";
    }
}
