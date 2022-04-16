package com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.java8;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);

        return ship;
    }

    Ship createShip();

    //java8 버번에서는 private method 를 지원하지 않으므로 중간에 abstract class(DefaultShipFactory) 를 하다 더 두는 방식으로 구현한다.
    void validate(String name, String email);

    void prepareFor(String name);

    void sendEmailTo(String email, Ship ship);
}
