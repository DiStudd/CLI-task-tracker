package com.distudd;

public class Task {

    String title;
    boolean isComplete;


    public Task(String title) {
        this.title = title;
        this.isComplete = false;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean getStatus () {
        return this.isComplete;
    }

    public void changeStatus(boolean status) {
        this.isComplete = status;
    }

    public String printTask () {
        return ("- [" + (isComplete ? "x" : " ") +  "] " + this.title);
    }
}
