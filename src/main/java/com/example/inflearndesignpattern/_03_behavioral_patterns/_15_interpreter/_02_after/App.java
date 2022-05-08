package com.example.inflearndesignpattern._03_behavioral_patterns._15_interpreter._02_after;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parser("xyz+-");
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
        System.out.println(result);
    }
}
