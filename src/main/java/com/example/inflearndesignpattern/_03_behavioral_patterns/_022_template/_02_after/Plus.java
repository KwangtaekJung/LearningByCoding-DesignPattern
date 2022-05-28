package com.example.inflearndesignpattern._03_behavioral_patterns._022_template._02_after;

public class Plus extends FileProcessor {
    public Plus(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        return result += number;
    }
}
