package com.introduction.learnspringframework.springdependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age, Address address){ }
record Address(String firstLine,String City){}

@Configuration
public class SpringConfiguration {
    @Bean
    public String name(){
        return "Zaid";
    }

    @Bean
    public int age(){
        return 21;
    }

    @Bean
    public Person person()
    {
        return new Person("Zaid",21, address());
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(),new Address("abc","gef"));
    }

    @Bean(name = "address2")
    public Address address()
    {
        return new Address("yo","yo");
    }

    //pass beans in parameter
    @Bean
    public Person person3Parameters(String name,int age, Address address2){
        return new Person(name,age,address2);
    }
}
