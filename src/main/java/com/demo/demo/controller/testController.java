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
    public String test4() {
        System.out.println("master4");
        return "master4";
    }
}
