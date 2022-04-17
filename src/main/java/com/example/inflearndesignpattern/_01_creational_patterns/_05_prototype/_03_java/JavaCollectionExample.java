package com.example.inflearndesignpattern._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student keesun = new Student("keesun");
        Student whiteship = new Student("whiteship");
        List<Student> students = new ArrayList<>();
        students.add(keesun);
        students.add(whiteship);

        //List는 clone을 지원하지 않으며 ArrayList가 clone을 지원하지만 이런 형태로 사용하지는 않는다.
        //Collection을 복제하는 다양한 방법이 있을수 있는데 여기서는 생성자를 이용하는 방법을 사용해보자.
        //shallow copy 이며 엄밀히 말하자면 프로터타입 패턴을 이용하는 것은 아니다.
        //ArrayList<Student> clone0 = (ArrayList<Student>) students.clone();
        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
