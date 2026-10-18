package com.distudd;

import java.util.Scanner;

public class Main {


    static void main() {
        TaskList tasks = new TaskList("list");

        Scanner scan = new Scanner(System.in);

        boolean work = true;

//        TODO: create menu class
        do {

            System.out.println("Выберите действие:");
            System.out.println("1 - список задач");
            System.out.println("2 - добавить задачу");
            System.out.println("3 - выход");

            String inp = scan.nextLine();

            switch (inp) {
                case "1":
                    if (tasks.getTasks().isEmpty()) {
                        System.out.println("emp");
                    } else {
                        for (Task task : tasks.getTasks()) {
                            System.out.println(task.printTask());
                        }
                    }
                    break;

                case "2":
                    System.out.println("введите название");
                    tasks.addTask(new Task(scan.nextLine()));
                    break;

                case "3":
                    System.out.println("выход");
                    work = false;
                    break;

                default:
                    System.out.println("wrong command");

            }

        } while (work);

//        Task task1 = new Task("Task 1");
//
//
//        task1.changeStatus(true);
//        tasks.addTask(task1);
//
//
//        System.out.println(tasks.getTasks().getFirst().printTask());
    }
}
