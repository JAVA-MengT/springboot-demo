package com.demo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengjinlin
 * @create 2018-11-03 20:46
 */
@RestController
public class testController {
    @RequestMapping("/")
    public String test1() {
        System.out.println("master1");
        return "master";
    }
    public String test2() {
        System.out.println("master2");
        return "master";
    }
}
