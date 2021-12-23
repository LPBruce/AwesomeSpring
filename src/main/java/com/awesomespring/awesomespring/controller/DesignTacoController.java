package com.awesomespring.awesomespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;


/**
 * 
 * 注解@RequestMapping在类级别置顶控制器处理的请求类型
 */
@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
    
    @GetMapping("/get")
    public String showDesignForm() {
        log.info("begin to design Taco.");
        return "";
    }
    @PostMapping("/get")
    public String processDesign() {
        return "";
    }
}
