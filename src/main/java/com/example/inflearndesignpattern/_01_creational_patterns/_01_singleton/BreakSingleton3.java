package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

import java.lang.reflect.Constructor;

/**
 * 싱글턴 패턴 4: 안전하고 단순하게 구현하는 방법
 * enum 은 Reflection 이용한 싱글톤 깨뜨르기로부터 안전하다.
 * 아래 코드는 에러 발생함. => NoSuchMethodException => 생성자를 찾지 못함.
 */
public class BreakSingleton3 {

    public static void main(String[] args) throws Exception {
        Settings4 settingsA = Settings4.INSTANCE;
        Settings4 settingsB = Settings4.INSTANCE;
        System.out.println(settingsA == settingsB);

        Constructor<Settings4> constructor = Settings4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings4 settingsC = constructor.newInstance();

        System.out.println(settingsA == settingsC);
        System.out.println(settingsB == settingsC);
    }
}
