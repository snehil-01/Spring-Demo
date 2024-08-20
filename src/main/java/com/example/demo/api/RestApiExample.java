package com.example.demo.api;

import com.example.demo.models.User;
import com.example.demo.utils.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class RestApiExample {
    @GetMapping("/hello")
    public String getStudent(){
        return "Hello world!!";
    }

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        String response = "{\"message\": \"Operation successful\", \"status\": true}";
        return response;
    }
}
