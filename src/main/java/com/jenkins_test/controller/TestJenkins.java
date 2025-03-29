package com.jenkins_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestJenkins {

    @GetMapping("/hello-jenkins")
    public String test(){
        return "Hello ! ";
    }
}
