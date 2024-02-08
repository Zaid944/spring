package com.introduction.learnspringframework.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Component
class NormalClass{

}

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass{

}

@Component
class SomeClass{
    @Autowired
    private SomeDependency someDependency;
    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency = someDependency;
    }

    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }
    @PreDestroy
    public void cleanup(){
        someDependency.cleanUp();
    }
}

@Component
class SomeDependency{
    public void getReady(){
        System.out.println("some logic using");
    }
    public void cleanUp(){
        System.out.println("Destroyed bean");
    }
}

@Configuration
@ComponentScan
public class ScopeClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeClass.class);

        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));

    }
}
