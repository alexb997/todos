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

    @GetMapping("/todos")
    public List<String> getTodos() {
        List<String> todos= new ArrayList<>();
        todos.add("Element1");
        todos.add("Element2");
        todos.add("Element3");
        return todos;
    }
    // Create getTodos method that will receive as a input parameter an id and it will return a single string from the list index

    @GetMapping("/getGreeting/{name}")
    public String getGreeting(@PathVariable(value = "name") String name) {
        return "Hello " + name;
    }
}
