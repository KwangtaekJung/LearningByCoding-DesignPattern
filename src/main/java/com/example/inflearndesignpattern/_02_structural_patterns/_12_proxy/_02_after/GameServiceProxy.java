package com.example.inflearndesignpattern._02_structural_patterns._12_proxy._02_after;

import com.example.inflearndesignpattern._02_structural_patterns._12_proxy._01_before.GameService;

public class GameServiceProxy extends GameService {

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
