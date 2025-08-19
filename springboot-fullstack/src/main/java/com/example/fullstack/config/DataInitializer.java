package com.example.fullstack.config;

import com.example.fullstack.task.Task;
import com.example.fullstack.task.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner seedTasks(TaskRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                Task t1 = new Task();
                t1.setTitle("Welcome to the app");
                t1.setDescription("Explore features and add your tasks");
                t1.setCompleted(false);
                t1.setDueDate(LocalDate.now());

                Task t2 = new Task();
                t2.setTitle("Read documentation");
                t2.setDescription("Open README to see instructions");
                t2.setCompleted(false);
                t2.setDueDate(LocalDate.now().plusDays(3));

                repository.save(t1);
                repository.save(t2);
            }
        };
    }
}

