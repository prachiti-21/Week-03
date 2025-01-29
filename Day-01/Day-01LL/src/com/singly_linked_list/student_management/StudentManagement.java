package com.singly_linked_list.student_management;

/*class Student {
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

/*class StudentList{
    private com.singly_linked_list.student_management.Student head;
    public void addAtBeginning(int roll_number,String name,int age,String grade){
        com.singly_linked_list.student_management.Student s= new com.singly_linked_list.student_management.Student(roll_number,name,age,grade);
        s.next=head;
        head=s;
    }
    public void addAtEnd(int roll_number,String name,int age,String grade){
        com.singly_linked_list.student_management.Student s=new com.singly_linked_list.student_management.Student(roll_number,name,age,grade);
        if(head==null){
            head=s;
            return;
        }
        com.singly_linked_list.student_management.Student temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=s;
    }
    public void addAtPosition(int position,int roll_number,String name,int age,String grade){
        if(position<1){
            System.out.println("Invalid position");
        }
        if(position==1){
            addAtBeginning(roll_number,name,age,grade);
            return;
        }
        com.singly_linked_list.student_management.Student s=new com.singly_linked_list.student_management.Student(roll_number,name,age,grade);
        com.singly_linked_list.student_management.Student temp=head;
        for(int i=1;i<position-1;i++){
            if(temp==null){
                System.out.println("Position out of range");
                return;
            }
            temp=temp.next;
        }
        s.next=temp.next;
        temp.next=s;
    }
    public void deleteByRollNumber(int roll_number){
        if(head.roll_number==roll_number){
            head=head.next;
            return;
        }
        com.singly_linked_list.student_management.Student temp=head;
        while(temp.next!=null && temp.next.roll_number!=roll_number){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("com.singly_linked_list.student_management.Student not found");
        }
        else{
            temp.next=temp.next.next;
        }
    }
    public void searchByRollNumber(int roll_number){
        com.singly_linked_list.student_management.Student temp=head;
        while(temp!=null){
            if(temp.roll_number==roll_number){
                System.out.println("com.singly_linked_list.student_management.Student found: Roll Number: "+temp.roll_number);
            }
            temp=temp.next;
        }
        System.out.println("student not found");
    }
    public void updateGrade(int roll_number, String newgrade){
        com.singly_linked_list.student_management.Student temp=head;
        while(temp!=null){
            if(temp.roll_number==roll_number){
                temp.grade=newgrade;
                System.out.println("Grade updated");
                return;
            }
            temp=temp.next;
        }
        System.out.println("com.singly_linked_list.student_management.Student not found");
    }
    public void displayAll(){
        if(head==null){
            System.out.println("No student records");
            return;
        }
        com.singly_linked_list.student_management.Student temp=head;
        while(temp!=null){
            System.out.println("Roll number: "+temp.roll_number+", Name: "+temp.name+", Age: "+temp.age+", Grade: "+temp.grade);
            temp=temp.next;
        }
    }

}*/
public class StudentManagement{
    public static void main(String[] args) {
        StudentList studentList=new StudentList();
        studentList.addAtEnd(1,"John",12,"A");
        studentList.addAtBeginning(2,"Seena",13,"B");
        studentList.addAtPosition(3,3,"Ashok",13,"B");
        studentList.displayAll();

        studentList.searchByRollNumber(2);
        studentList.updateGrade(2,"C");
        studentList.displayAll();

        studentList.deleteByRollNumber(1);
        studentList.displayAll();

    }
}
