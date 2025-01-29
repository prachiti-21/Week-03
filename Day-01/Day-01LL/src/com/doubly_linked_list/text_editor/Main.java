package com.doubly_linked_list.text_editor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        // Simulating text editor actions
        editor.addState("State 1: Hello");
        editor.addState("State 2: Hello World");
        editor.addState("State 3: Hello World!");

        System.out.println("Initial states:");
        editor.displayCurrentState();

        System.out.println("\nUndoing actions:");
        editor.undo();
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();

        System.out.println("\nRedoing actions:");
        editor.redo();
        editor.displayCurrentState();

        System.out.println("\nAdding new state after undo:");
        editor.addState("State 4: Hello World Again!");
        editor.displayCurrentState();

        System.out.println("\nUndoing and redoing actions with new state:");
        editor.undo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
    }
}
