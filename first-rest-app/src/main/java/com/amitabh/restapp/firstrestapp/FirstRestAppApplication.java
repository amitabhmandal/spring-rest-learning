package com.amitabh.restapp.firstrestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@Controller
public class FirstRestAppApplication {

    @ResponseBody
    @RequestMapping("/")
    public String sayAloha() {
        return "Aloha";
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstRestAppApplication.class, args);
    }
}
