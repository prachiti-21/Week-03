package com.binary_search;
import static java.lang.System.*;
public class PeakElement {
    public static int findPeakElement(int[]array){
        int n=array.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(array[mid]>array[mid-1] && array[mid]>array[mid+1]){
                return array[mid];
            }
            else if(array[mid]<array[mid-1]){
                right=mid-1;
            }
            else if(array[mid]<array[mid+1]){
                left=mid+1;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int[] array={1,3,20,4,1,0,6,9};
        out.println("Peak element is "+findPeakElement(array));
    }
}
