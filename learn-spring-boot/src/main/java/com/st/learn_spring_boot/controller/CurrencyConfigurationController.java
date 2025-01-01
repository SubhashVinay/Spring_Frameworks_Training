package com.st.learn_spring_boot.controller;

import com.st.learn_spring_boot.config.CurrencyServiceConfiguration;
import com.st.learn_spring_boot.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @GetMapping("/currency-configuration")
    public CurrencyServiceConfiguration retriveAllCourses(){
        return configuration;
    }
}
