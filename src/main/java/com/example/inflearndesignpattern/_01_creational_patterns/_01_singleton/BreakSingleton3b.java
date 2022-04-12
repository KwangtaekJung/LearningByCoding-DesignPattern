package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

import java.lang.reflect.Constructor;

/**
 * 싱글턴 패턴 4: 안전하고 단순하게 구현하는 방법
 * enum 은 Reflection 이용한 싱글톤 깨뜨르기로부터 안전하다.
 * 생성자를 찾도록 변경해서 시도해도 에러 발생한다. => Cannot reflectively create enum objects
 * reflection 에서 막아 놓았음.
 */
public class BreakSingleton3b {

    public static void main(String[] args) throws Exception {
        Settings4 settingsA = Settings4.INSTANCE;
        Settings4 settingsB = Settings4.INSTANCE;
        System.out.println(settingsA == settingsB);

        Settings4 settingsC = null;
        Constructor<?>[] constructors = Settings4.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            settingsC = (Settings4) constructor.newInstance("INSTANCE");
        }

        System.out.println(settingsA == settingsC);
        System.out.println(settingsB == settingsC);
    }
}
