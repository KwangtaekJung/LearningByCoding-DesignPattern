package com.example.inflearndesignpattern._01_creational_patterns._03_abstract_factory._02_after;

public class WhiteShipProPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheal createWheal() {
        return new WhiteWhealPro();
    }
}
