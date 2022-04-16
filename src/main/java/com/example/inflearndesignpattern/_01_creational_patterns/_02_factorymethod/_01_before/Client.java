package com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._01_before;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("whiteship", "abc@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("blackship", "abc@mail.com");
        System.out.println(blackship);
    }
}
