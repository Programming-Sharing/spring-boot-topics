package com.programmingsharing.springboottopics.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConstructorInjectDemoController {

    // Service A
    private DemoServiceA demoServiceA;

    // Service B
    private DemoServiceB demoServiceB;

    @Autowired(required = false)
    public ConstructorInjectDemoController(@Qualifier("demoServiceAImpl") DemoServiceA demoServiceA, DemoServiceB demoServiceB) {
        this.demoServiceA = demoServiceA;
        this.demoServiceB = demoServiceB;
        System.out.println("Services injected by two-arguments constructor");
    }

    @Autowired(required = false)
    public ConstructorInjectDemoController(@Qualifier("demoServiceAImpl") DemoServiceA demoServiceA) {
        this.demoServiceA = demoServiceA;
        System.out.println("Services injected by one-argument constructor");
    }

    @Autowired(required = false)
    public ConstructorInjectDemoController() {
        System.out.println("ConstructorInjectDemoController initialized by no-argument constructor");
    }

    @GetMapping("/constructor-demo")
    @ResponseBody
    public String hello(){
        return "Hello, demoService: "+ demoServiceA;
    }
}
