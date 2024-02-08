package com.introduction.learnspringframework.springdependency;

import com.introduction.learnspringframework.javaCoupling.GameRunner;
import com.introduction.learnspringframework.javaCoupling.GamingConsole;
import com.introduction.learnspringframework.javaCoupling.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        return new PacMan();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
