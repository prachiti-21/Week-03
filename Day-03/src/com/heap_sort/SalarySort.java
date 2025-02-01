package com.heap_sort;

import java.util.Arrays;

public class SalarySort {
    public static void  sort(int[]salary){
        int n=salary.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(salary,n,i);
        }
        //swap the elements
        for(int i=n-1;i>=0;i--){
            int temp=salary[0];
            salary[0]=salary[i];
            salary[i]=temp;
            heapify(salary,i,0);
        }
    }
    public static void heapify(int[]salary,int n,int i){
        int largest=i;
        int li=2*i+1;
        int ri=2*i+2;

        if(li<n && salary[li]>salary[largest]){
            largest=li;
        }
        if(ri<n && salary[ri]>salary[largest]){
            largest=ri;
        }
        if(largest!=i){
            int temp=salary[i];
            salary[i]=salary[largest];
            salary[largest]=temp;
        }
    }

    public static void main(String[] args) {
        int[] salary={5000,2000,4500,1200,3200};
        int n=salary.length;
        SalarySort.sort(salary);
       // SalarySort.heapify(salary,n,i);
        System.out.println(Arrays.toString(salary));
    }
}
