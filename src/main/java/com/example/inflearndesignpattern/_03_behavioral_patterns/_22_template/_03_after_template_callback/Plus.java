package com.example.inflearndesignpattern._03_behavioral_patterns._22_template._03_after_template_callback;

public class Plus implements Operator {
    @Override
    public int getResult(int result, int number) {
        return result += number;
    }
}
