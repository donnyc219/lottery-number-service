package com.lottery.main;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NumberController {

    @CrossOrigin
    @RequestMapping("/test")
    public String test(){
        return "this is just a test";
    }

    @CrossOrigin
    @RequestMapping("/test2")
    public Map<String, String> test2(){
        Map m = new HashMap();
        m.put("test", "it works!");
        return m;
    }
}
