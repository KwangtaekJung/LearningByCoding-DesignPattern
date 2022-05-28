package com.example.inflearndesignpattern._03_behavioral_patterns._23_visitor._02_after;

/**
 * Concrete Element
 */
public class Circle implements Shape {
    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
