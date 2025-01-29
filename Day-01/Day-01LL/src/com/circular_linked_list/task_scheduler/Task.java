package com.circular_linked_list.task_scheduler;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

/*class TaskScheduler {
    private Task head;
    private Task current;

    public TaskScheduler() {
        head = null;
        current = null;
    }

    // Add a task at the beginning
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newTask.next = head;
            temp.next = newTask;
            head = newTask;
        }
    }

    // Add a task at the end
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Add a task at a specific position
    public void addTaskAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        if (position <= 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        int currentPosition = 1;
        while (temp.next != head && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }

    // Remove a task by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("No tasks available to remove.");
            return;
        }
        Task temp = head;
        Task prev = null;
        do {
            if (temp.taskId == taskId) {
                if (prev != null) {
                    prev.next = temp.next;
                    if (temp == head) {
                        head = temp.next;
                    }
                } else {
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                System.out.println("Task removed successfully.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task not found.");
    }

    // View the current task and move to the next task
    public void viewAndMoveToNext() {
        if (current == null) {
            current = head;
        }
        if (current != null) {
            System.out.println("Current Task: ID=" + current.taskId + ", Name=" + current.taskName + ", Priority=" + current.priority + ", Due Date=" + current.dueDate);
            current = current.next;
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for tasks by Priority
    public void searchTasksByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks found with priority " + priority + ".");
        }
    }
}

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
}*/
