package com.singly_linked_list.student_management;

class Student {
    int roll_number;
    String name;
    int age;
    String grade;
    Student next;

    Student(int roll_number, String name, int age, String grade) {
        this.roll_number = roll_number;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
