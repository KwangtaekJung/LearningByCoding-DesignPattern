package com.example.inflearndesignpattern._01_creational_patterns._03_abstract_factory._02_after;

import com.example.inflearndesignpattern._01_creational_patterns._03_abstract_factory._01_before.WhiteAnchor;
import com.example.inflearndesignpattern._01_creational_patterns._03_abstract_factory._01_before.WhiteWheal;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheal createWheal() {
        return new WhiteWheal();
    }
}
