package com.kavin.spring.todoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //make this as a bean
public class HelloController {

    @RequestMapping("say-hello")  //localhost:8080/say-hello
    @ResponseBody
    public String sayHello(){
        return "How are you? From Hello Controller";
    }

    @RequestMapping("say-hello-jsp")  //localhost:8080/say-hello-jsp
    public String sayHelloJSP(){
        return "sayHello";
    }
}
