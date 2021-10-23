package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerResource {
    @GetMapping("/get-all-customer")
    public String getAllCustomer() {
        return "All Customer";
    }
}
