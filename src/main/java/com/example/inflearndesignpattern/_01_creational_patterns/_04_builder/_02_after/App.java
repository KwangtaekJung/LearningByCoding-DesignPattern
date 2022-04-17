package com.example.inflearndesignpattern._01_creational_patterns._04_builder._02_after;

import com.example.inflearndesignpattern._01_creational_patterns._04_builder._01_before.TourPlan;

public class App {

    public static void main(String[] args) {

        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = tourDirector.cancunTrip();
        System.out.println("tourPlan = " + tourPlan);

        TourPlan longBeachTrip = tourDirector.longBeachTrip();
        System.out.println("longBeachTrip = " + longBeachTrip);
    }
}
