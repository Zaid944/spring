package com.springweb.todo.Hello;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(){
        return "Hello";
    }

    @RequestMapping("hello-html")
    @ResponseBody
    public String helloHTML(){
//        StringBuffer sb = new StringBuffer();

        return "Hello to HTML";
    }

    //JSP -> View Creation
    @RequestMapping("say-hello-jsp")
//    @ResponseBody
    public String Hello(){
        return "Hello";
    }

}
