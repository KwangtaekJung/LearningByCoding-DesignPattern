package com.example.inflearndesignpattern._02_structural_patterns._08_composite._02_after;

public class Client {
    public static void main(String[] args) {

        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade); //아이템의 가격
        client.printPrice(bag); //가방 안의 모든 아이템 가격들의 합
    }

    //컴포짓 패턴의 장점
    // - 새로운 종류의 Component 타입이 생기더라도 Client 코드(printPrice)도 변경되지 않는다.
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
