package com.example.techtalkdemo.maths.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResultDto {
    private String action;
    private int value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultDto resultDto = (ResultDto) o;
        return value == resultDto.value && Objects.equals(action, resultDto.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, value);
    }
}
