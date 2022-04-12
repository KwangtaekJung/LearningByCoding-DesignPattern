package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

/**
 * 싱글톤 패턴 1: 싱글톤 패턴을 가장 단순히 구현하는 방법
 * using private constructor and public static method
 */
public class Settings1 {

    private static Settings1 instance;

    private Settings1() { }

    public static Settings1 getInstance() {
        if (instance == null) {
            instance = new Settings1();
        }

        return instance;
    }
}
