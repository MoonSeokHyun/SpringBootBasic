package com.example.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //Get 방식의 메소드 방식
    //hello-world (endpoint)

    @GetMapping(path = "/hello-world")
    public String helloWolrd() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWolrdBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWolrdBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s" , name));
    }

}
