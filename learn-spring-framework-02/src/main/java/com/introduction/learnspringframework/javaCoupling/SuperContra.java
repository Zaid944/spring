package com.introduction.learnspringframework.javaCoupling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContraQualifier")
public class SuperContra implements GamingConsole{
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
