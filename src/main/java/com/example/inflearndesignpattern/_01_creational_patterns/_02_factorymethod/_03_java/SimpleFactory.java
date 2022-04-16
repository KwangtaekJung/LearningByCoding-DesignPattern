package com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._03_java;

import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.BlackShip;
import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class.WhiteShip;

public class SimpleFactory {

    /**
     * Simple Factory Pattern<br>
     * returns a different instance according to the name
     *
     * @param name Ship Name
     * @return Ship Instance
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
