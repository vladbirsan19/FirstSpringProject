package com.HelloWorld.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")

    public String sayHi() {
        return "Hello World";
    }

    @GetMapping("/{name}")
    public String sayHiToSomeone(@PathVariable String name) {
        return "Hello " + name;

    }

    @GetMapping("//{date}")

    public String showDate(@PathVariable String date) {
        return date + "12/07/2022 ";
    }
}
