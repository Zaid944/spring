package com.databases.springboot.learnjpaandhibernate.courseSpringJPA;//package com.databases.springboot.learnjpaandhibernate.courseJpa;

import com.databases.springboot.learnjpaandhibernate.Course;
import com.databases.springboot.learnjpaandhibernate.courseJdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseSpringDataJPA repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn AWS1", "in28Minutes"));
        repository.save(new Course(2,"Learn AWS2", "in29Minutes"));
        repository.save(new Course(3,"Learn AWS3", "in30Minutes"));
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("in28Minutes"));

    }
}

// Hibernate is implementation of JPA
// JPA is API for specifying the entity, column, primarykey etc

