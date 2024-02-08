package com.introduction.learnspringframework.javaCoupling;

public class JavaGame {
    public static void main(String[] args) {
        //this is tight coupling
//        MarioGame game = new MarioGame();
        SuperContra game = new SuperContra();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
