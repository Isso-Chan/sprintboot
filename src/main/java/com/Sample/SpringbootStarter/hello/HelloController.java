package com.Sample.SpringbootStarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //
public class HelloController {

    @RequestMapping("/hello") //takes parameter 'for request' which is URL that the sayHi method needs to map
    public String sayHi(){
        return "Hi!";
    }
}
