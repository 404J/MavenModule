package com.mars.app1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App1Controller {

    @Autowired
    App1Service app1Service;

    @RequestMapping("app1")
    public String app1(){
        return app1Service.app1();
    }
}
