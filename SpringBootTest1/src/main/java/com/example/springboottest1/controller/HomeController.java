package com.example.springboottest1.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String getHome(@RequestParam(name ="name", required = false, defaultValue = "World ! ")
                          String name, Model model){
        model.addAttribute("name",name);
        return "Hello " + name;
    }

}
