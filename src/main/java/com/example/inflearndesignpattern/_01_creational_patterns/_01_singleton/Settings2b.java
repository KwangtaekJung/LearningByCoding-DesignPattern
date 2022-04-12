package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

/**
 * 싱글톤 패턴 2: 멀티 쓰레드 환경에서 안전하게 구현하는 방법
 * double checked locking
 */
public class Settings2b {
    private static volatile Settings2b instance;

    private Settings2b() { }

   public static Settings2b getInstance() {
        if (instance == null) {
            synchronized (Settings2b.class) {
                if (instance == null) {
                    instance = new Settings2b();
                }
            }
        }

        return instance;
   }

}
