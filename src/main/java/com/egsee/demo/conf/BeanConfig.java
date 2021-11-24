package com.egsee.demo.conf;

import com.egsee.demo.service.PersonService;
import com.egsee.demo.service.impl.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    PersonService personService(){
        System.out.println("在容器中添加了一个组件:peronService");
        return new PersonServiceImpl();
    }
}
