package com.example.dat22agithub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("helloworld.com")
    public String helloWorld() {
        return "Hello World<br>你好地球<br>こんにちは世界";
    }

    // comment about code
    
    // comment from github
}
