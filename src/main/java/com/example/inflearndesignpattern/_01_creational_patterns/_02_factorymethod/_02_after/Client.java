package com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("whiteship", "abc@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("blackship", "abc@mail.com");
        System.out.println(blackship);
    }
}
