//package com.databases.springboot.learnjpaandhibernate.courseJpa;
//
//import com.databases.springboot.learnjpaandhibernate.Course;
//import com.databases.springboot.learnjpaandhibernate.courseJdbc.CourseJdbcRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CourseJpaCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJPARepository repository;
//    @Override
//    public void run(String... args) throws Exception {
//        repository.insert(new Course(1,"Learn AWS1", "in28Minutes"));
//        repository.insert(new Course(2,"Learn AWS2", "in29Minutes"));
//        repository.insert(new Course(3,"Learn AWS3", "in30Minutes"));
//        repository.deleteById(1);
//
//        System.out.println(repository.findById(2));
//        System.out.println(repository.findById(3));
//    }
//}
