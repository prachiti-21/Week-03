package com.binary_search;

public class Search2D {
    public static boolean search(int[][]matrix,int rows,int columns,int target){
        int left=0;
        int right=rows*columns-1;
        while(left<=right){
            int mid=(left+right)/2;
            int row=mid/columns;
            int col=mid%columns;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                right=mid-1;
            }
            else if(matrix[row][col]<target){
                left=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int rows=3;
        int columns=3;
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int target=2;
        System.out.println(search(matrix,rows,columns,target));

    }
}
