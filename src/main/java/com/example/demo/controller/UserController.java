package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "users")
public class UserController {

    @RequestMapping(value = "login")
    @ResponseBody
    public String test(User user) {
        System.out.println(user.getUsername());
        return JSON.toJSONString(user);
    }
}
