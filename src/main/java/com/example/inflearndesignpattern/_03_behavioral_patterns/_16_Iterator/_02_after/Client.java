package com.example.inflearndesignpattern._03_behavioral_patterns._16_Iterator._02_after;

import com.example.inflearndesignpattern._03_behavioral_patterns._16_Iterator._01_before.Post;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        // TODO 들어간 순서대로 순회하기 1
//        Iterator<Post> iterator = board.getPosts().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().getTitle());
//        }

        // TODO 들어간 순서대로 순회하기 2
        Iterator<Post> defaultIterator = board.getDefaultIterator();
        while (defaultIterator.hasNext()) {
            System.out.println(defaultIterator.next().getTitle());
        }

        // TODO 가장 최신 글 먼저 순회하기
    }

}