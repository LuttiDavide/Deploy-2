package com.example.demodeploy2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DemoController {

    @GetMapping("/sum")
    public String getSum() {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int sum = num1 + num2;
        return "Sum of " + num1 + " and " + num2 + " is " + sum;
    }

}
