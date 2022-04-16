package com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class;

public class BlackShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
