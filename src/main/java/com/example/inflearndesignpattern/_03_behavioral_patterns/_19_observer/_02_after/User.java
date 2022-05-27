package com.example.inflearndesignpattern._03_behavioral_patterns._19_observer._02_after;

/**
 * Concrete Observer
 */
public class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void handleMessage(String message) {
        System.out.println(message);
    }
}
