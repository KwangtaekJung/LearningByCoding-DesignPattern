package com.example.inflearndesignpattern._03_behavioral_patterns._17_mediator._02_after;

public class CleaningService {

    private FrontDesk frontDesk = new FrontDesk();

    public void getTowels(Integer guestId, int numberOfTowels) {
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
        System.out.println("provide " + numberOfTowels + " to " + roomNumber);
    }
}
