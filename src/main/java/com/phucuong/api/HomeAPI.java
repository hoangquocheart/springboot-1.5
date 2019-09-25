package com.phucuong.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeAPI {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String home(ModelMap model) {
        return "home";
    }


    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String test(ModelMap model) {
        return "home";
    }
}
