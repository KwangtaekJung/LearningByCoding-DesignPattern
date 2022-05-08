package com.example.inflearndesignpattern._03_behavioral_patterns._17_mediator._02_after;

public class FrontDesk {

    private CleaningService cleaningService = new CleaningService();

    public void getTowels(Guest guest, int numberOfTowels) {
        cleaningService.getTowels(guest.getId(), numberOfTowels);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1111";
    }
}
