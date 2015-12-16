package com.example.yasser.testapp.model;

/**
 * Created by ahmedabodeif1 on 12/15/15.
 */
public class Task {
    private int id;
    private String title;
    private String description;
    private String status;
    private int assigner_id;
    private int assignee_id;

    public Task(int id, String title, String description, String status, int assigner_id, int assignee_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.assigner_id = assigner_id;
        this.assignee_id = assignee_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAssigner_id() {
        return assigner_id;
    }

    public void setAssigner_id(int assigner_id) {
        this.assigner_id = assigner_id;
    }

    public int getAssignee_id() {
        return assignee_id;
    }

    public void setAssignee_id(int assignee_id) {
        this.assignee_id = assignee_id;
    }
}
