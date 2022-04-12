package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 싱글톤 패턴 3: 싱글톤 패턴 구현 방법을 깨뜨리는 방법
 * Using Reflection
 */
public class BreakSingleton1 {

    public static void main(String[] args) throws Exception {
        Settings1 settingsA = Settings1.getInstance();
        Settings1 settingsB = Settings1.getInstance();
        System.out.println(settingsA == settingsB);

        Constructor<Settings1> constructor = Settings1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings1 settingsC = constructor.newInstance();
        System.out.println(settingsA == settingsC);
        System.out.println(settingsB == settingsC);
    }

}
