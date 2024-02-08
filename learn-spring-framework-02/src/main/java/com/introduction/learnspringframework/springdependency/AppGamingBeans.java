package com.introduction.learnspringframework.springdependency;

import com.introduction.learnspringframework.javaCoupling.GameRunner;
import com.introduction.learnspringframework.javaCoupling.GamingConsole;
import com.introduction.learnspringframework.javaCoupling.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.introduction.learnspringframework.javaCoupling")
public class AppGamingBeans {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppGamingBeans.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
