package com.example.workflowdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = {"/", "/demo"}) // match both "/" and "/demo"
    public String demo() {
        return "demo works again!!";
    }

}
