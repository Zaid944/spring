package com.databases.springboot.learnjpaandhibernate.courseSpringJPA;

import com.databases.springboot.learnjpaandhibernate.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJPA extends JpaRepository<Course,Long> {
    List<Course> findByAuthor(String author);
}
