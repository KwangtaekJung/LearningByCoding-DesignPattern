package com.example.inflearndesignpattern._01_creational_patterns._03_abstract_factory._01_before;

import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class.DefaultShipFactory;
import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class.Ship;
import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheal(new WhiteWheal());
        return ship;
    }
}
