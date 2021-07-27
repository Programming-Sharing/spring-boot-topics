package com.programmingsharing.springboottopics.setter_injection;

import com.programmingsharing.springboottopics.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

public class SetterInjectionDemo {
    private DemoService demoService;

    @Autowired
    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }
}
