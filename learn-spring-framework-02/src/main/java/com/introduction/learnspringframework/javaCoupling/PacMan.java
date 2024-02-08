package com.introduction.learnspringframework.javaCoupling;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Down");
    }
    public void left(){
        System.out.println("left");
    }
    public void right(){
        System.out.println("right");
    }
}
