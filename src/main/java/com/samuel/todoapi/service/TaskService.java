package com.samuel.todoapi.service;

import com.samuel.todoapi.entity.Task;
import com.samuel.todoapi.repository.TaskRepository;
import org.springframework.stereotype.Service;
import com.samuel.todoapi.exception.TaskNotFoundException;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        List<Task> tasksList = repository.findAll();
        return tasksList;
    }

    public Task getTaskById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task with id " + id + " not found"));
    }

    public Task createTask(Task task) {
        repository.save(task);
        return task;
    }

    public void deleteTask(Integer id) {
        Task task = getTaskById(id);
        repository.delete(task);
    }

}
