package com.example.techtalkdemo.maths.service;

import com.example.techtalkdemo.maths.dto.ResultDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {
    @Test
    void shouldReturnCorrectResultWithAdditionValue() {
        MathService service = new MathService();

        ResultDto actualDto = service.add(10, 15);
        ResultDto expectedDto = new ResultDto("Addition", 25);

        assertEquals(expectedDto,actualDto);
    }

    @Test
    void shouldReturnResultDtoWithDifferenceValue() {
        MathService service = new MathService();

        ResultDto actualDto = service.subtract(10, 5);
        ResultDto expectedDto = new ResultDto("Difference", 5);

        assertEquals(expectedDto,actualDto);
    }
}