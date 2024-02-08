package com.introduction.learnspringframework.dependencyInjection;

import com.introduction.learnspringframework.javaCoupling.GameRunner;
import com.introduction.learnspringframework.javaCoupling.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
    Dependency1 dependency1;
    Dependency2 dependency2;

    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2){
        super();
        System.out.println("constructor injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("setter injection");
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("setter injection");
//        this.dependency2 = dependency2;
//    }

    public String toString(){
        return "dependency1 " + "dependency2";
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class AppGamingBeans {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppGamingBeans.class);
        System.out.println(context.getBean(YourBusinessClass.class).toString());
    }
}
