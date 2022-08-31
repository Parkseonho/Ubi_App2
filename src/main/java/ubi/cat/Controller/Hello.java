package ubi.cat.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello{

    @GetMapping("/api/hello")
    public String test() {
        return "Hello, world!";
    }
}