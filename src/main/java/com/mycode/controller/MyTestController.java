package com.mycode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyTestController {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "ok";
        
    }
}
