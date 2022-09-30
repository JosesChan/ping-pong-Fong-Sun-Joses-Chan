package com.deimus.pingpongdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongControllers {

    @RequestMapping("/")
        String hello() {
        return "Hello! You can try to see if this program works by typing 'curl localhost:8080/ping' on command prompt or by entering localhost:8080/ping on any web browser";
    }

    @RequestMapping("/ping")
    public String ping(){
        return "Pong";
    }
}
