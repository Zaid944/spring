package com.introduction.springboot.learnspringboot;

public class Course {
    private long id;
    private String name;
    private String  author;

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public String getAuthor() {
        return author;
    }
}
