package com.introduction.learnspringframework.springdependency;

import com.introduction.learnspringframework.javaCoupling.GameRunner;
import com.introduction.learnspringframework.javaCoupling.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBeans {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
