package com.gmail.tyler8806.TestServer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/greetings")
    public ResponseEntity<Object> getGreeting() {
        Map<String, Object> obj = new HashMap<>();
        obj.put("greeting", "Hello World8!");
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
