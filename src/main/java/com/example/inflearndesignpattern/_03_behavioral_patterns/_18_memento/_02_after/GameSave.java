package com.example.inflearndesignpattern._03_behavioral_patterns._18_memento._02_after;

public final class GameSave {

    private final int redTeamScore;

    private final int blueTeamScore;

    public GameSave(int redTeamScore, int blueTeamScore) {
        this.redTeamScore = redTeamScore;
        this.blueTeamScore = blueTeamScore;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }
}
