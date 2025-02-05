package com.linear_search;
import java.util.*;
import static java.lang.System.*;
public class FirstNegativeInteger {
    public static int findFirstNegativeInteger(int array[]){
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]array={1,2,-1,3,5,-9};
        out.println("First negative integer index is: "+findFirstNegativeInteger(array));
    }
}
