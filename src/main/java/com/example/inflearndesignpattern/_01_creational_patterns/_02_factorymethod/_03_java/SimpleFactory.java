package com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._03_java;

import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.BlackShip;
import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.java8.WhiteShip;

public class SimpleFactory {

    /**
     * 가장 기본적인 Simple Factory Pattern
     * @param name Ship Name
     * @return
     */
    public Object createProduct(String name) {

        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
