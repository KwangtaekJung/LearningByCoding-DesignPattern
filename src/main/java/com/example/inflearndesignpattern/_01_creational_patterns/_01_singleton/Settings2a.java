package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

import java.io.Serializable;

/**
 * 싱글톤 패턴 2: 멀티 쓰레드 환경에서 안전하게 구현하는 방법
 * synchronized 이용하여 동기화 처리
 */
public class Settings2a implements Serializable {

    private static Settings2a instance;

    private Settings2a() { }

    public static synchronized Settings2a getInstance() {
        if (instance == null) {
            instance = new Settings2a();
        }

        return instance;
    }
}
