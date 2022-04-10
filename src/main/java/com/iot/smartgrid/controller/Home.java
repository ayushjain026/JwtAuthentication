package com.iot.smartgrid.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Home {

    @RequestMapping("/welcome")
    public String welcome()
    {
        String text = "Hello Developers ";
        text+="You are Pro Developer";
        return text;
    }

    @RequestMapping("/getuser")
    public String getUser()
    {
        return "{\"name:\"Ayush\"}";
    }

}

