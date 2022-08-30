package co.develhope.springBootStart.controllers;

import co.develhope.springBootStart.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/")
    public String sayHello(){
        return helloWorldService.sayHelloWorld();
    }
}
