package com.springweb.todo.todo;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class TodoService {
    private static int todosCount = 0;
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(++todosCount, "Zaid", "Learn", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "Zaid", "Learn Devops", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "Zaid", "Learn Full Stack", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }
    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone){
        Todo todo = new Todo(++todosCount,username,description,targetDate,isDone);
        todos.add(todo);
    }
}
