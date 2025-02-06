package com.binary_search;

public class RotationPoint {
    public static int findRotationPoint(int[]array){
        int n=array.length;
        int left=0;
        int right=n-1;
        //running while loop till left is not equal to right
        while(left!=right){
            int mid= (left+right)/2;
            if(array[mid]>array[right]){
                left=mid+1;
            }
            else {
                right=mid;
            }
        }
        //returning smallest integer
        return array[left];
    }

    public static void main(String[] args) {
        int[] array={2,4,6,8,10};
        System.out.println("Rotating point is: "+findRotationPoint(array));
    }
}
