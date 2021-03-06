package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    public void testFindByListName() {
        // Given
        TaskList taskList = new TaskList("In progress", "Make a sale raport");
        taskListRepository.save(taskList);
        String listName = taskList.getListName();


        // When
        List<TaskList> readListName = taskListRepository.findByListName(listName);


        // Then
        Assert.assertEquals(1, readListName.size());


        // CleanUp
        taskListRepository.deleteAll();
    }
}
