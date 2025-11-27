package com.example.todo;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Arrays;

@Service
public class TodoService {

    public List<String> getTodos() {
        return Arrays.asList("Learn Spring Boot", "Work on collaborative project");
    }
}
