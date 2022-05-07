package com.example.inflearndesignpattern._03_behavioral_patterns._14_command._02_after;

import com.example.inflearndesignpattern._03_behavioral_patterns._14_command._01_before.Game;

public class GameEndCommand implements Command {

    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.end();
    }

    @Override
    public void undo() {
//        game.start();  //이렇게 하면 안되나??
        new GameStartCommand(this.game).execute();
    }
}
