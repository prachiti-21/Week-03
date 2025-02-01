package com.bubble_sort;

import java.util.Arrays;

public class StudentBubble {
    public static void sort(int[] marks, int n) {
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (marks[j] > marks[j + 1]) {
                    temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                }
            }
        }
        /*for(int i=0;i<n;i++){
            System.out.print(marks[i]);
        }*/

    }

    public static void main(String[] args) {
        int marks[]={100,400,200,500,300};
        int n=marks.length;
        StudentBubble.sort(marks,n);
        System.out.println(Arrays.toString(marks));
    }
}
