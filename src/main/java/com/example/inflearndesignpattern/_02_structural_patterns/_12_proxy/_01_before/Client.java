package com.example.inflearndesignpattern._02_structural_patterns._12_proxy._01_before;

import com.example.inflearndesignpattern._02_structural_patterns._12_proxy._02_after.GameServiceProxy;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
