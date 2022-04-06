package com.iot.smartgrid.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/welcome")
    public String welcome()
    {
        String text = "Hello Developers ";
        text+="this page is not allowed";
        return text;
    }

    @RequestMapping("/getuser")
    public String getUser()
    {
        return "{\"name:\"Ayush\"}";
    }

}

