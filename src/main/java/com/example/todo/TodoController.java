package com.example.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @GetMapping("/todos")
    public List<String> getTodos() {
        return List.of(
                "Apprendre Git en équipe",
                "Implémenter le controller",
                "Tester l'API /todos"
        );
    }
}
