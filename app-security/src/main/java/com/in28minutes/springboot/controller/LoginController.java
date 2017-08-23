package com.in28minutes.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        model.put("name", "in28Minutes");
        return "welcome";
    }
    
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(ModelMap model) {
    	model.put("name", "hi");
        return "welcome";
    }
    

}