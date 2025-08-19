package com.example.fullstack.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class TaskServiceTest {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    void saveAndFind() {
        Task task = new Task();
        task.setTitle("Test");
        task.setDescription("Desc");
        task.setCompleted(false);
        Task saved = taskRepository.save(task);
        assertThat(saved.getId()).isNotNull();
        assertThat(taskRepository.findById(saved.getId())).isPresent();
    }
}

