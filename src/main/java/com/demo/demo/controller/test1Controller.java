package com.demo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengjinlin
 * @create 2018-11-03 20:46
 */
@RestController
public class test1Controller {
    @RequestMapping("/")
    public String test1() {
        System.out.println("master13");
        return "master13";
    }
}
