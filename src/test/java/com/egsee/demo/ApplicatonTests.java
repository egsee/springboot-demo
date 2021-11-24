package com.egsee.demo;

import com.egsee.demo.conf.PersonConfigurationProperties;
import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    PersonConfigurationProperties person;

    @Autowired
    ApplicationContext ioc;

    @Test
    void testPersonService() {
        boolean b = ioc.containsBean("personService");
        if (b) {
            System.out.println("personService 已经添加到 IOC 容器中");
        } else {
            System.out.println("personService 没添加到 IOC 容器中");
        }
    }

    @Test
    void logTest(){
        logger.trace("trace 级别日志");
        logger.debug("debug 级别日志");
        logger.info("info 级别日志");
        logger.warn("warn 级别日志");
        logger.error("error 级别日志");
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }


}
