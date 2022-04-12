package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 싱글톤 패턴 3: 싱글톤 패턴 구현 방법을 깨뜨리는 방법
 * using serialization * deserialization
 */
public class BreakSingleton2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Settings2a settingsA = Settings2a.getInstance();

        Settings2a settingsB = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settingsA);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settingsB = (Settings2a) in.readObject();
        }

        System.out.println(settingsA == settingsB);
    }
}
