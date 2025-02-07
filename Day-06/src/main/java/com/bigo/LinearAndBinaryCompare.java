package com.bigo;

import java.util.*;
import static java.lang.System.*;
public class LinearAndBinaryCompare {
    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000};

        Random random=new Random();
        for (int s : sizes) {
           int [] dataset=new int[s];
            for(int i=0;i<s;i++){
                dataset[i]=random.nextInt(s*10);
              }
            int target=dataset[random.nextInt(s)];

            //linear search execution time
            long startTime=System.nanoTime();
            linearSearch(dataset,target);
            long linearTime= System.nanoTime()- startTime;

            //sort array
            Arrays.sort(dataset);

            //binary search execution time
            startTime= System.nanoTime();
            binarySearch(dataset,target);
            long binaryTime= System.nanoTime()-startTime;

            //displaying time and result
            out.println("Dataset size: "+s);
            out.println("execution time of linear search: "+linearTime/1_000_000.0+" ms");
            out.println("execution time of binary search: "+binaryTime/1_000_000.0+" ms");
            if(binaryTime<linearTime){
                out.println("Binary Search  performs much better for large datasets, provided data is sorted");
            }
            else{
                out.println("Wrong comparison");
            }
            }

        }

}
