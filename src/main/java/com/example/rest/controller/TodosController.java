package com.example.rest.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodosController {
    private List<String> todos = new ArrayList<>();

    @GetMapping("/todos")
    public List<String> getTodos() {
        return todos;
    }

    @PostMapping("/add")
    public void postTodos(@RequestParam String todo) {
        todos.add(todo);
    }

    @DeleteMapping("delete/{index}")
    public void deleteTodos(@PathVariable(value = "index") int index) {
        todos.remove(index);
    }

    @GetMapping("/todo/{index}")
    public String getTodo(@PathVariable(value = "index") int index) {
        return todos.get(index);
    }
}

