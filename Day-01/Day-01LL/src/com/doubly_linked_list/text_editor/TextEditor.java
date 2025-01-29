package com.doubly_linked_list.text_editor;

class TextEditor {
    private TextState head;
    private TextState tail;
    private TextState current;
    private int size;
    private final int maxSize;

    public TextEditor(int maxSize) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    // Add a new state
    public void addState(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        } else {
            head = newState;
        }
        current = newState;
        tail = newState;
        size++;

        // Trim history if it exceeds maxSize
        if (size > maxSize) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        }
    }

    // Undo functionality
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more actions to undo.");
        }
    }

    // Redo functionality
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more actions to redo.");
        }
    }

    // Display current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        } else {
            System.out.println("No content available.");
        }
    }
}
