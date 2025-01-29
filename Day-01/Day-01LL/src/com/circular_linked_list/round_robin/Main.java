package com.circular_linked_list.round_robin;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);

        System.out.println("Initial Processes:");
        scheduler.displayProcesses();

        scheduler.simulateRoundRobin(3);

        System.out.println("Processes after simulation:");
        scheduler.displayProcesses();
    }
}
