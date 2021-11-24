package com.egsee.demo.controller;

import com.egsee.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/login")
    @ResponseBody
    public String doLogin() {
//        User user = userService.getByName(user)
        return "test";
    }
}
