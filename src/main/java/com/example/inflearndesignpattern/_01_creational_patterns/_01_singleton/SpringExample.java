package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 싱글톤 패턴 5: 자바와 스프링에서 찾아보는 패턴
 * 싱글톤 스코프
 */
public class SpringExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello1 = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);

        System.out.println(hello1 == hello2);
    }
}
