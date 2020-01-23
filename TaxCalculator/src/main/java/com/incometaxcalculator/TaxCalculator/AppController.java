package com.incometaxcalculator.TaxCalculator;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class AppController {

    @RequestMapping("/")
    public String welcome(){
            System.out.println("in the welcome method");
        return "Welcome";
    }
}
