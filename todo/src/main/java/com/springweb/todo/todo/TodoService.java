package com.springweb.todo.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    public void deleteById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
