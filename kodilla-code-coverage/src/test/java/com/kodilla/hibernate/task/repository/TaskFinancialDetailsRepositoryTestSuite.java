package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsRepositoryTestSuite {

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Autowired
    TaskFinancialDetailsRepository taskFinancialDetailsRepository;

    @After
    public void tearDown() throws Exception {
        taskFinancialDetailsRepository.deleteAll();
    }

    @Test
    public void testFindByPaid() {
        //Given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailsRepository.save(taskFinancialDetails);
        long id = taskFinancialDetails.getId();

        //When
        List<TaskFinancialDetails> resultList = taskFinancialDetailsRepository.findByPaid(false);

        //Then
        Assert.assertEquals(1, resultList.size());
    }
}
