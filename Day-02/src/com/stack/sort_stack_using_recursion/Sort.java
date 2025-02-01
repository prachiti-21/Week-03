package com.stack.sort_stack_using_recursion;
import java.util.Stack;
public class Sort {
    Stack<Integer>s=new Stack<>();
    public static void sortStack(Stack<Integer>stack){
        if(!stack.empty()){
            int top=stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack,top);
        }
    }
    public static  void insertInSortedOrder(Stack<Integer>stack,int element){
        if(stack.isEmpty() || stack.peek()<=element){
            stack.push(element);
        }
        else{
            int temp=stack.pop();
            insertInSortedOrder(stack,element);
            stack.push(temp);
        }
    }
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}





