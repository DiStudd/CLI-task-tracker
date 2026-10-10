package com.distudd;

import java.util.Scanner;

public class Main {


    static void main() {
        TaskList tasks = new TaskList("list");

        Scanner scan = new Scanner(System.in);

        while(true) {
//            for (int i = 0; i < 50; i++) {
//                System.out.println();
//            }

            System.out.println("Выберите действие:");
            System.out.println("1 - список задач");
            System.out.println("2 - добавить задачу");

            String inp = scan.nextLine();

            switch (inp) {
                case "1":
                    if (tasks.getTasks().isEmpty()) {
                        System.out.println("emp");
                    }
                    else {
                        for(Task task : tasks.getTasks()) {
                            System.out.println( task.printTask() );
                        }
                    }
                    break;

                case "2":
                    System.out.println("введите название");
                    tasks.addTask(new Task(scan.nextLine()));
                    break;

                default:
                    System.out.println("wrong command");

            }

        }

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
