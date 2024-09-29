package ru.medov.oath2string6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("")
public class HomeController {



    @ResponseBody
    @GetMapping("/secured")
    public String secured(){
        return "ITS SECURED";
    }

    @GetMapping("/hello")
    public String index(){
        return "index";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }


}
