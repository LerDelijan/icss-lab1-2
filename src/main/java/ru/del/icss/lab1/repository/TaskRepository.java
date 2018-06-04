package ru.del.icss.lab1.repository;

import org.springframework.data.repository.CrudRepository;
import ru.del.icss.lab1.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
