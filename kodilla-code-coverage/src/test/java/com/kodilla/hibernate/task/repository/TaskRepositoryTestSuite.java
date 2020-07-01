package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskRepositoryTestSuite {

    @Autowired
    private TaskRepository taskRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @After
    public void tearDown() throws Exception {
        taskRepository.deleteAll();
    }

    @Test
    public void testTaskRepositorySave () {
        //Given
        Task task = new Task(DESCRIPTION, 7);

        //When
        taskRepository.save(task);

        //Then
        Long id = task.getId();
        Optional<Task> readTask = taskRepository.findById(id);
        Assert.assertTrue(readTask.isPresent());
    }

    @Test
    public void testTaskRepositoryFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskRepository.save(task);
        int duration = task.getDuration();

        //When
        Set<Task> readTasks = taskRepository.findByDuration(duration);

        //Then
        Assert.assertEquals(1, readTasks.size());
    }

    @Test
    public void testTaskRepositorySaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        TaskFinancialDetails financialDetails = new TaskFinancialDetails(new BigDecimal(120), false);
        task.setTaskFinancialDetails(financialDetails);

        //When
        taskRepository.save(task);
        long id = task.getId();

        //Then
        assertNotEquals(0, id);
    }
}
