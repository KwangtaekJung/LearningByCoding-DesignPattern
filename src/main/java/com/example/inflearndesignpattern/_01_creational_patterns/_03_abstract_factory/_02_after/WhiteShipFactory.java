package com.example.inflearndesignpattern._01_creational_patterns._03_abstract_factory._02_after;

import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class.DefaultShipFactory;
import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class.Ship;
import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {
    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    /**
     * Anchor, Wheal 만드는 과정을 추상화한다.
     *
     * @return Ship
     */
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheal(shipPartsFactory.createWheal());
        return ship;
    }
}
