package com.example.inflearndesignpattern._02_structural_patterns._11_flyweight._03_java;

public class FlyweightInJava {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2); // valueOf 내부에서 자주 사용되는 값은 캐싱을 하므로 true가 나온다.
        System.out.println(i1.equals(i2)); //인스턴스가 아닌 실제 값을 비교한다.


        Integer i3 = Integer.valueOf(10000);
        Integer i4 = Integer.valueOf(10000);
        System.out.println(i3 == i4); // valueOf가 자주 사용하는 값이 아니라고 판단하여 캐싱하지 않는다. 따라서 false 나온다.
        System.out.println(i3.equals(i4)); //인스턴스가 아닌 실제 값을 비교해보면 동일하다. 따라서 실무에선는 == 말고 equals를 사용하는 것이 좋다.
    }
}
