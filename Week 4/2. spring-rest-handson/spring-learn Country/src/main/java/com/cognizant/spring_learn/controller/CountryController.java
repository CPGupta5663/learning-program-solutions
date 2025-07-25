package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RestController
public class CountryController {
@RequestMapping("/country")
public Country getCountryIndia() {
    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
        return context.getBean("country", Country.class);
    }
}
}
