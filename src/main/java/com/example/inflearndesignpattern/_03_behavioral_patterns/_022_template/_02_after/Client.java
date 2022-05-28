package com.example.inflearndesignpattern._03_behavioral_patterns._022_template._02_after;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Plus("number.txt");
        int result = fileProcessor.process();
        System.out.println(result);

        FileProcessor multiply = new Multiply("number.txt");
        int resultMultiply = multiply.process();
        System.out.println("resultMultiply = " + resultMultiply);
    }
}
