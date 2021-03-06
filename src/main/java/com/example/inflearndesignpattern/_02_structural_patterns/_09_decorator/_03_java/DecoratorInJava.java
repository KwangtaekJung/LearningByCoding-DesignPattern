package com.example.inflearndesignpattern._02_structural_patterns._09_decorator._03_java;

import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        // Collections가 제공하는 데코레이터 메소드
        ArrayList list = new ArrayList<>();
        list.add(new Book());

        //Book.class만 넣을 수 있는 리스트로 변환한다.
        List books = Collections.checkedList(list, Book.class);


        list.add(new Item());
//        books.add(new Item()); //ClassCastException 발생함.

        List unmodifiableList = Collections.unmodifiableList(list);
        list.add(new Item());
//        unmodifiableList.add(new Book());  //UnsupportedOperationException 발생


        // 서블릿 요청 또는 응답 랩퍼
        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }

    private static class Book {

    }

    private static class Item {

    }
}
