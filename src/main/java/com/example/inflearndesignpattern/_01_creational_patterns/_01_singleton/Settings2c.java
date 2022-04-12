package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

/**
 * 싱글톤 패턴 2: 멀티 쓰레드 환경에서 안전하게 구현하는 방법
 * static inner class 사용하기
 */
public class Settings2c {

    private Settings2c() { }

    public static class SettingsHolder {
        private static final Settings2c INSTANCE = new Settings2c();
    }

    public static Settings2c getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
