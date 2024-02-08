package com.introduction.learnspringframework.exercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;


interface DataService{
    int[] retrieveData();
}

@Component
@Primary
class MongoDataService implements DataService{
    @Override
    public int[] retrieveData(){
        return new int[] {11,22,33,44};
    }
}

@Component
class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData(){
        return new int[] {1,2,3,4};
    }
}

@Component
class BusinessCalculationService{
    @Autowired
    DataService dataService;
    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}

@Configuration
@ComponentScan
public class AppGamingBeans {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppGamingBeans.class);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
}
