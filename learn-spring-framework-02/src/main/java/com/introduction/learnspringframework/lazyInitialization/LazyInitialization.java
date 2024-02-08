package com.introduction.learnspringframework.lazyInitialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    @Autowired
    private ClassA classA;
    public ClassB(ClassA classA){
        System.out.println("Some Initialization");
        this.classA = classA;
    }
    public void DoSomething(){
        System.out.println("do something");
    }
}

@Configuration
@ComponentScan
public class LazyInitialization {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyInitialization.class);
        context.getBean(ClassB.class).DoSomething();

    }
}
