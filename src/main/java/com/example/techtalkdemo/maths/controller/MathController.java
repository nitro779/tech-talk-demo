package com.example.techtalkdemo.maths.controller;

import com.example.techtalkdemo.maths.dto.ResultDto;
import com.example.techtalkdemo.maths.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @Autowired
    private MathService mathService;
    @GetMapping("/")
    public String welcome(){
        return "Welcome to Tech Talk";
    }

    @GetMapping(value = "/addition",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultDto add(@RequestParam("a") int a, @RequestParam("b") int b){
        return mathService.add(a,b);
    }
}
