package com.egsee.demo.controller;

import com.egsee.demo.conf.PersonConfigurationProperties;
import com.egsee.demo.conf.PersonThroughValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetController {

    @Autowired
    private PersonConfigurationProperties person;

    @Autowired
    private PersonThroughValue personThroughValue;

    @GetMapping("/greet")
    @ResponseBody
    public String greet() {
        return "Greet from springboot";
    }

    @GetMapping("/person")
    @ResponseBody
    public PersonConfigurationProperties person() {
        return person;
    }

    @GetMapping("/person1")
    @ResponseBody
    public PersonThroughValue person1() {
        return personThroughValue;
    }
}
