package com.programmingsharing.springboottopics.fieldinjection;

import com.programmingsharing.springboottopics.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @Autowired
    @Qualifier("demoServiceAlphaImpl")
    private DemoService demoService;

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello, demoService: "+ demoService;
    }
}
