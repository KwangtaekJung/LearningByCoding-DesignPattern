package com.example.inflearndesignpattern._03_behavioral_patterns._23_visitor._02_after;

/**
 * Visitor
 */
public interface Device {

    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
