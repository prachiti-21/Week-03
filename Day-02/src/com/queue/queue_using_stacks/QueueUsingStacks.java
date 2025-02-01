package com.queue.queue_using_stacks;

import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue operation
    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            // Transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Peek operation (returns front element)
    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            // Transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.peek());    // Output: 2
        System.out.println(queue.dequeue()); // Output: 2
        System.out.println(queue.isEmpty()); // Output: false
    }
}
