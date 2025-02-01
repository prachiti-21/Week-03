package com.stack.stock_span_problem;
import java.util.*;
public class StockSpan{
    public int[] calculateCount(int[]arr ,int n){
        Stack<Integer>stack=new Stack<>();
        int span[]=new int[n];

        for(int i=0;i<n;i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return span;


    }
    public static void main(String[] args) {
        StockSpan ss=new StockSpan();
        Scanner sc=new Scanner(System.in);
     int n;
     System.out.println("Enter number of days: ");
     n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("Enter prices: ");
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     int[]spans= ss.calculateCount(arr,n);
        System.out.println("Stock spans:");
        for(int span:spans){
            System.out.print(span+" ");
        }
    }



}

