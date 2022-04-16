package com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.java8;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
