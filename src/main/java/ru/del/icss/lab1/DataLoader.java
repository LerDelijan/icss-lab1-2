package ru.del.icss.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.del.icss.lab1.domain.Task;
import ru.del.icss.lab1.repository.TaskRepository;


@Component
public class DataLoader implements CommandLineRunner {

    private final TaskRepository repository;

    @Autowired
    public DataLoader(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        repository.save(new Task("Load failure", "Open", "Failed to load some data"));
        repository.save(new Task("Log In bug", "Closed", "Some stuff with log in"));
        repository.save(new Task("Another bug", "In progress", "It's definitely not a feature"));
    }
}
