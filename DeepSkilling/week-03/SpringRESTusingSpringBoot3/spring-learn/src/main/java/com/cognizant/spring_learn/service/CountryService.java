package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.CountryList;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    public Country getCountry(String code) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        CountryList countries = context.getBean("countryList", CountryList.class);

        for (Country country : countries.getCountryList()) {

            if (country.getCode().equalsIgnoreCase(code)) {
                context.close();
                return country;
            }
        }

        context.close();
        return null;
    }
}