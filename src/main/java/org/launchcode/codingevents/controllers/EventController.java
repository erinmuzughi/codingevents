package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EventController {
    @RequestMapping("events")

    @GetMapping
    public String displayAllEvents(Model model) {
        List<String> eventNames = new ArrayList<>();
        eventNames.add("Pride");
        eventNames.add("Turkey Run");
        eventNames.add("Boo at the Zoo");

        model.addAttribute("event", eventNames );
        return "events/index";

    }

}
