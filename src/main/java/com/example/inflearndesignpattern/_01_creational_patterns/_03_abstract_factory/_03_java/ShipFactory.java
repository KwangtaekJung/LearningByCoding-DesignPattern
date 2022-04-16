package com.example.inflearndesignpattern._01_creational_patterns._03_abstract_factory._03_java;

import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class.Ship;
import com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
