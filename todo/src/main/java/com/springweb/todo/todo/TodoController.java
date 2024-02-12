package com.springweb.todo.todo;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    private TodoService todoService;


    // list-todos
    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model){
        List<Todo> todos = todoService.findByUsername("");
        model.addAttribute("todos", todos);
        return "listTodos";
    }

    // add-todo
    @RequestMapping(value="add-todo", method= RequestMethod.GET)
    public String showNewTodo(ModelMap model){
        Todo todo = new Todo(0, (String)model.get("name"), "", LocalDate.now().plusYears(1), false);
        model.put("todo",todo);
        return "todo";
    }

    @RequestMapping(value="add-todo", method= RequestMethod.POST)
//    public String addNewTodo(@RequestParam String description, ModelMap model){
//        todoService.addTodo((String)model.get("name"), description, LocalDate.now().plusYears(1), false);
//        return "redirect:list-todos";
//    }
        public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "todo";
        }
        todoService.addTodo((String)model.get("name"), todo.getDescription(), todo.getTargetDate(), false);
        return "redirect:list-todos";
    }

    @RequestMapping("delete-todo")
    public String delete(@RequestParam int id){
        todoService.deleteById(id);
        return "redirect:list-todos";
    }

    @RequestMapping("update-todo")
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model){
        Todo todo = todoService.findById(id);
        model.addAttribute("todo", todo);
        return "todo";
    }

    @RequestMapping(value="update-todo",method = RequestMethod.POST)
    public String updateTodo(ModelMap map, @Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "todo";
        }
        String username = (String)map.get("name");
        todo.setUsername(username);
        todoService.updateTodo(todo);
        return "redirect:list-todos";
    }
}
