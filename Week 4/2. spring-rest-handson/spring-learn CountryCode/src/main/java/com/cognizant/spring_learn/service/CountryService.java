package com.cognizant.spring_learn.service;

import java.util.List;
import java.util.Optional;

import com.cognizant.spring_learn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    public Country getCountry(String code) {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        @SuppressWarnings("unchecked")
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        Optional<Country> match = countryList.stream()
            .filter(c -> c.getCode().equalsIgnoreCase(code))
            .findFirst();

        if (match.isPresent()) {
            return match.get();
        } else {
            throw new RuntimeException("Country not found with code: " + code);
        }
    }
}
