package com.example.inflearndesignpattern._03_behavioral_patterns._19_observer._03_java;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println(event.getSource());
        System.out.println(event.getMessage());
    }
}
