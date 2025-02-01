package com.insertion_sort;

import java.util.Arrays;

public class EmployeeSort {
    public static void Idsort(int[]empid,int n){
        for(int i=1;i<n;i++){
            int current=empid[i];
            int j=i-1;
            while(j>=0 &&  current<empid[j]){
                empid[j+1]=empid[j];
                j--;
            }
            empid[j+1]=current;
        }
    }

    public static void main(String[] args) {
        int empid[]={1,6,2,8,10,12,5};
        int n=empid.length;
        EmployeeSort.Idsort(empid,n);
        System.out.println(Arrays.toString(empid));
    }
}
