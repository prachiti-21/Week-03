package com.quick_sort;

import java.util.Arrays;

public class SortProductPrice {
    public static int partition(int price[],int low,int high){
        int pivot=price[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(price[j]<pivot){
                i++;
                //swap
                int temp=price[i];
                price[i]=price[j];
                price[j]=temp;
            }
        }
        i++;
        int temp=price[i];
        price[i]=pivot;
        price[high]=temp;
        return i;
    }
    public static void quickSort(int price[],int low,int high){
        if(low<high){
            int pidx=partition(price,low,high);
            quickSort(price,low,pidx-1);
            quickSort(price,pidx+1,high);
        }

    }

    public static void main(String[] args) {
        int[]price={400,100,120,450,230};
        int n=price.length;
        quickSort(price,0,n-1);
        System.out.println(Arrays.toString(price));
    }
}
