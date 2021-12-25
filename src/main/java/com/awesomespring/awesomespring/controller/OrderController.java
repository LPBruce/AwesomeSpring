package com.awesomespring.awesomespring.controller;

import javax.validation.Valid;

import com.awesomespring.awesomespring.service.vo.Taco;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
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
    public String processOrder(@Valid Taco taco, Errors errors) {
        if (errors.hasErrors()) {
            return "";
        }

        log.info("order submitted: ");
        return "";
    }
}
