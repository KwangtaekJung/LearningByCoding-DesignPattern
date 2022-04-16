package com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "abc@mail.com");
        client.print(new BlackShipFactory(), "blackship", "abc@mail.com");

    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
