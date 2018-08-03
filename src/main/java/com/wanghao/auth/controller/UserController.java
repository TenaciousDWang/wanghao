package com.wanghao.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wanghao.auth.entity.UniCamelUserExample;
import com.wanghao.auth.service.UserService;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
	
    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(){
    	UniCamelUserExample example = new UniCamelUserExample();
        return userService.selectByExample(example);
    }
}
