package com.binary_search;
import java.util.logging.Logger;

class MyClass {

    Logger logger = Logger.getLogger(getClass().getName());

    public void doSomething() {
        // ...
        logger.info("My Message");  // Compliant, output via logger
        // ...
    }
}
public class FirstAndLastOccurence {
    public static int firstOccurance(int[]array,int target){
        int n=array.length;
        int left=0;
        int right=n-1;
        int firstOccurance=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(array[mid]==target){
                firstOccurance=mid;
                right=mid-1;

            }
            else if(array[mid]>target){
                right=mid-1;
            }
            else if(array[mid]<target){
                left=mid+1;
            }

        }
        return firstOccurance;
    }
    public static int lastOccurance(int[]array,int target){
        int n=array.length;
        int left=0;
        int right=n-1;
        int lastOccurance=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(array[mid]==target){
                lastOccurance=mid;
                left= mid+1;

            }
            else if(array[mid]>target){
                right=mid-1;
            }
            else if(array[mid]<target){
                left=mid+1;
            }

        }
        return lastOccurance;
    }

    public static void main(String[] args) {
        int[] array= {1,2,3,4,3,5,5,5,6};
        int target=5;
        System.out.println("First occurance :"+firstOccurance(array,target));
        System.out.println("Last occurance: "+lastOccurance(array,target));
    }
}
