package com.circular_linked_list.task_scheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTaskAtEnd(1, "Task One", 3, "2025-01-30");
        scheduler.addTaskAtEnd(2, "Task Two", 2, "2025-01-31");
        scheduler.addTaskAtBeginning(3, "Task Three", 1, "2025-01-29");

        System.out.println("All Tasks:");
        scheduler.displayAllTasks();

        System.out.println("\nViewing and moving to next tasks:");
        scheduler.viewAndMoveToNext();
        scheduler.viewAndMoveToNext();

        System.out.println("\nSearching for tasks with priority 2:");
        scheduler.searchTasksByPriority(2);

        System.out.println("\nRemoving task with ID 2:");
        scheduler.removeTaskById(2);
        scheduler.displayAllTasks();
    }
}

