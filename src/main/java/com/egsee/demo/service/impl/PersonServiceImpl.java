package com.egsee.demo.service.impl;

import com.egsee.demo.conf.PersonConfigurationProperties;
import com.egsee.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceImpl implements PersonService {


    @Autowired
    private PersonConfigurationProperties person;


    @Override
    public PersonConfigurationProperties getPersonInfo() {
        return person;
    }
}
