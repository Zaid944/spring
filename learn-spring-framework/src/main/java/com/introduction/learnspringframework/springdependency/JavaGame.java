package com.introduction.learnspringframework.springdependency;

import com.introduction.learnspringframework.javaCoupling.GameRunner;
import com.introduction.learnspringframework.javaCoupling.SuperContra;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaGame {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));

    }
}
