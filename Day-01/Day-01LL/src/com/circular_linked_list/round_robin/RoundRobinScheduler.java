package com.circular_linked_list.round_robin;

class RoundRobinScheduler {
    private Process head;

    public RoundRobinScheduler() {
        head = null;
    }

    // Add a new process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            head.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    // Remove a process by Process ID
    public void removeProcessById(int processId) {
        if (head == null) {
            System.out.println("No processes available to remove.");
            return;
        }
        Process temp = head;
        Process prev = null;
        do {
            if (temp.processId == processId) {
                if (prev != null) {
                    prev.next = temp.next;
                    if (temp == head) {
                        head = temp.next;
                    }
                } else {
                    Process last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                System.out.println("Process removed: ID=" + processId);
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Process not found: ID=" + processId);
    }

    // Simulate Round Robin Scheduling
    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }
        System.out.println("Simulating Round Robin Scheduling:");
        Process temp = head;
        while (true) {
            boolean done = true;
            do {
                if (temp.burstTime > 0) {
                    done = false;
                    int executedTime = Math.min(temp.burstTime, timeQuantum);
                    System.out.println("Process ID=" + temp.processId + " executed for " + executedTime + " units.");
                    temp.burstTime -= executedTime;
                    if (temp.burstTime == 0) {
                        System.out.println("Process ID=" + temp.processId + " completed.");
                        removeProcessById(temp.processId);
                        if (head == null) {
                            return;
                        }
                    }
                }
                temp = temp.next;
            } while (temp != head);
            if (done) {
                break;
            }
        }
    }

    // Display all processes
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes available.");
            return;
        }
        Process temp = head;
        System.out.println("Current Processes:");
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}
