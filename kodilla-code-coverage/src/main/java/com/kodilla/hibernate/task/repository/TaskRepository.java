package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Set;

@Repository
@Transactional
public interface TaskRepository extends CrudRepository<Task, Long> {

    Set<Task> findByDuration(int duration);
}
