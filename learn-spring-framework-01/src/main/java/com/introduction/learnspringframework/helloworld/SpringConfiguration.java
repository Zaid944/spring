package com.introduction.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    @Bean(name = "person1")
    @Primary
    public Person person(@Qualifier("myaddress") Address address)
    {
        return new Person("Zaid",21, address);
    }

    @Bean(name = "person2")
    public Person person2MethodCall(){
        return new Person(name(),age(),new Address("abc","gef"));
    }

    @Qualifier("myaddress")
    @Bean(name = "address2")
    public Address address()
    {
        return new Address("yo","yo");
    }

    //pass beans in parameter
    @Bean(name = "person3")
    public Person person3Parameters(String name,int age, Address address2){
        return new Person(name,age,address2);
    }
}
