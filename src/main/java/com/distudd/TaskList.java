package com.distudd;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private String name;
    private ArrayList<Task> tasks = new ArrayList<Task>();

    public TaskList(String name) {
        this.name = name;
    }

    /**
     * Используется для добавления нового элемента в хранилище
     * @param task Task
     */
    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public ArrayList<Task> getTasks () {
        return this.tasks;
    }


}
