package com.example.springboot2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHome(@RequestParam(name ="name", required = false, defaultValue = "World!")
                          String name, Model model){
        model.addAttribute("name",name);
        return "home";
    }

}
