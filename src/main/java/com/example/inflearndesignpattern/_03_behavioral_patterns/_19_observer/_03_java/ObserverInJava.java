package com.example.inflearndesignpattern._03_behavioral_patterns._19_observer._03_java;

import java.util.Observable;
import java.util.Observer;

public class ObserverInJava {

    static class User implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println(arg);
        }
    }

    static class Subject extends Observable {
        public void add(String message) {
            setChanged();  //노티를 받기 위해서는 상태가 변경되었다고 설정해주어야 한다.
            notifyObservers(message);
            setChanged();  //여러번 노티를 받고자 하면 상태 변경 설정도 계속 해줘야 한다.
            notifyObservers(message);
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        User user = new User();
        subject.addObserver(user);
        subject.add("Hello Java, Observer");
    }

}
