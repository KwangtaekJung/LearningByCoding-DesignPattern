package com.example.inflearndesignpattern._01_creational_patterns._03_abstract_factory._02_after;

import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class.Ship;
import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheal().getClass());

        ShipFactory shipFactory2 = new WhiteShipFactory(new WhiteShipProPartsFactory());
        Ship ship2 = shipFactory2.createShip();
        System.out.println(ship2.getAnchor().getClass());
        System.out.println(ship2.getWheal().getClass());
    }
}
