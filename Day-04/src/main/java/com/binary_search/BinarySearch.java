package com.binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static int search(int[] arr,int target){
        int n=arr.length;
        //sort the array
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid= (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr={3,2,6,10,5,7};
        int target=6;
        System.out.println("The target index is: "+search(arr,target));
    }
}
