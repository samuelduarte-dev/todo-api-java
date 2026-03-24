package com.samuel.todoapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Title is required")
    @Size(max = 100, message = "Title must have at most 100 characters")
    @Column(nullable = false, length = 100)
    private String title;

    @Size(max = 255, message = "Description must have at most 255 characters")
    @Column(length = 255)
    private String description;

    @Column(nullable = false)
    private boolean completed;

    public Task(Integer id, boolean completed, String description, String title) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public Task() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}