package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 싱글턴 패턴 4: 안전하고 단순하게 구현하는 방법
 * enum 은 직렬화 & 역직렬화로 싱글톤 깨뜨리기로 부터도 안전하다.
 * 아래 코드는 true가 나온다.
 */
public class BreakSingleton4 {

    public static void main(String[] args) throws Exception {
        Settings4 settingsA = Settings4.INSTANCE;

        Settings4 settingsB = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settingsA);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settingsB = (Settings4) in.readObject();
        }

        System.out.println(settingsA == settingsB);
    }
}
