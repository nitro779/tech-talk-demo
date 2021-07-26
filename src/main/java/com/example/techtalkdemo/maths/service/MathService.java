package com.example.techtalkdemo.maths.service;

import com.example.techtalkdemo.maths.dto.ResultDto;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    public ResultDto add(int a, int b) {
        int sum = a + b;
        return new ResultDto("Addition", sum);
    }

    public ResultDto subtract(int a, int b) {
        int difference = a - b;
        return new ResultDto("Difference", difference);
    }
}
