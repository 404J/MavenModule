package com.mars.app2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

    @Autowired
    App2Service app2Service;

    @RequestMapping("app2")
    public String app2(){
        return app2Service.app2();
    }
}
