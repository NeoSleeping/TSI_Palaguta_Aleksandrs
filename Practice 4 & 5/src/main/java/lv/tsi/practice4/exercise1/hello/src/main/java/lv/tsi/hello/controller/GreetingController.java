package lv.tsi.hello.controller;

import lv.tsi.hello.module.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Spring") String name) {
        return Greeting.builder()
                .content("Hello, my name is " + name + "!")
                .build();
    }
}
