package com.introduction.learnspringframework.jakarta_cdi;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Component
@Named
class BusinessService{
    private DataService dataService;


    public DataService getDataService(){
        return dataService;
    }

//    @Autowired
    @Inject
    public void setDataService(DataService dataService){
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}

//@Component
@Named
class DataService{

}

@Configuration
@ComponentScan
public class CDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDI.class);
        System.out.println(context.getBean(BusinessService.class).getDataService());

    }
}

//@Service, @Controller, @Repository -> @Component
// alternates based on the function