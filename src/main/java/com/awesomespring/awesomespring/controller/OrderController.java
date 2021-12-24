package com.awesomespring.awesomespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("Get")
    public String orderForm() {
        return "";
    }
    
    @PostMapping
    public String processOrder() {
        log.info("order submitted: ");
        return "";
    }
}
