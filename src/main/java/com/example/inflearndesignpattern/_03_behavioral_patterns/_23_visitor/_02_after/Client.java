package com.example.inflearndesignpattern._03_behavioral_patterns._23_visitor._02_after;

public class Client {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.accept(new Pad());
        rectangle.accept(new Phone());
        rectangle.accept(new Watch());
    }
}
