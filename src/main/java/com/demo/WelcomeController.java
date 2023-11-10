package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/index")
    public String index() {
        return "index"; // The name of the HTML template for the welcome page
    }
}
