package com.guigu.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class HelloController {

    @RequestMapping(value = {"/id"})
    public String getidbyvalue(@RequestParam("id") String personId){
        System.out.println("ID id: " + personId);
        return "IDIDID!"+personId;
    }
    @RequestMapping("/")
    public String handl01(){
        return "Hello,Spring Boot 2!";
    }
}


