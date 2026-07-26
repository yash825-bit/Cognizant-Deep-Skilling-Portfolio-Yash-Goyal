package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

//    @RequestMapping("/country")
//    public Country getCountryIndia() {
//
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
//
//        Country country = context.getBean("country", Country.class);
//
//        context.close();
//
//        return  country;
//    }

    //constructor injection here
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    //getCountry method
    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {

        return countryService.getCountry(code);
    }
}
