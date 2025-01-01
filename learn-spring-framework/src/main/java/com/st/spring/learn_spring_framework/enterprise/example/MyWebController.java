package com.st.spring.learn_spring_framework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyWebController {
    @Autowired
    private BusinessService service;

    public long returnValueFromBusinessService(){
        return service.calculateSum();
    }
}
@Component
class BusinessService{
    @Autowired
    private DataService dataService;
    public long calculateSum(){
        return dataService.getData().stream().reduce(Integer::sum).get();
    }
}
@Component
class DataService{
    public List<Integer> getData(){
        return Arrays.asList(10,20,30,40);
    }
}
