package com.introduction.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaGame {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //System.out.println(context.getBean("name"));
        //System.out.println(context.getBean("age"));
        //System.out.println(context.getBean("person"));
        //System.out.println(context.getBean("address2"));
        //System.out.println(context.getBean("person2MethodCall"));
        //System.out.println(context.getBean("person3Parameters"));

        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean(Person.class));
       // Arrays.stream(context.getBeanDefinitionNames())
               // .forEach(System.out::println);
    }
}
