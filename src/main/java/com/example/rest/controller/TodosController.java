package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodosController {
    private List<String> todos=new ArrayList<>();

    @GetMapping("/todos")
    public List<String> getTodos() {
        return todos;
    }

    @GetMapping("/todo/{index}")
    public String getTodo(@PathVariable(value = "index") int index){
        return todos.get(index);
    }
    @GetMapping("/getGreeting/{name}")
    public String getGreeting(@PathVariable(value = "name") String name) {
        return "Hello " + name;
    }
}// List at class level, add todo and a delete todo;
