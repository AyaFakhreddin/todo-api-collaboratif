package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApiCollaboratifApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoApiCollaboratifApplication.class, args);
    }
}


	@Test
    void contextLoads() {
    }

    @Test
    void ciShouldFail() {
        Assertions.fail("Forcing CI to fail to test pipeline");
    }

}
