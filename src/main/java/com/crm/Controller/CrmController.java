package com.crm.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrmController {

    @GetMapping("/info")
    public String info(){
        return "git测试案例";
    }
    @GetMapping("/info2")
    public String info2(){
        return "git测试案例2";
    }

}
