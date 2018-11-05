package com.demo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengjinlin
 * @create 2018-11-05 12:31
 */
@RestController
public class teeee {
    @RequestMapping("/")
    public String test4() {
        System.out.println("aaa");
        return "aaaa";
    }

}
