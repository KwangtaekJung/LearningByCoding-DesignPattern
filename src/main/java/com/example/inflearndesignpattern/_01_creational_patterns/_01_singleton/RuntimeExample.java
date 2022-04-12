package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

/**
 * 싱글톤 패턴 5: 자바와 스프링에서 찾아보는 패턴
 * Runtime
 */
public class RuntimeExample {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
