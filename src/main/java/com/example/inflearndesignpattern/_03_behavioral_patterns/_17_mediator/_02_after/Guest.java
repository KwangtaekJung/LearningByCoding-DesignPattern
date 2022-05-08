package com.example.inflearndesignpattern._03_behavioral_patterns._17_mediator._02_after;

public class Guest {

    private Integer id;

    private FrontDesk frontDesk = new FrontDesk();

    public void getTowels(int numberOfTowels) {
        this.frontDesk.getTowels(this, numberOfTowels);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
