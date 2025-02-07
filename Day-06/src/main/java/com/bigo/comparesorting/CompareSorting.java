package com.bigo.comparesorting;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

public class CompareSorting {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000};

        Random random=new Random();
        for (int s : sizes) {
            int [] dataset=new int[s];
            for(int i=0;i<s;i++){
                dataset[i]=random.nextInt(s*10);
            }
            int target=dataset[random.nextInt(s)];

            //Merge sort execution time
            int si=0,ei=s-1;
            long startTime=System.nanoTime();
            MergeSort.divide(dataset,0,s-1);

            //int mid=si+(ei-si)/2;
            //MergeSort.conquer(dataset,0,mid,s-1);
            long mergeTime= System.nanoTime()- startTime;


            /*//bubble sort execution time
            startTime= System.nanoTime();
            BubbleSort.bubbleSort(dataset);
            long bubbleTime= System.nanoTime()-startTime;*/

            //quick sort execution time
            startTime= System.nanoTime();
           QuickSort.quickSort(dataset,0,s-1);
            long quickTime= System.nanoTime()-startTime;

            //displaying time and result
            out.println("Dataset size: "+s);
            out.println("execution time of Merge sort: "+mergeTime/1_000_000.0+" ms");
           // out.println("execution time of Bubble sort: "+bubbleTime/1_000_000.0+" ms");
            out.println("execution time of Quick sort: "+quickTime/1_000_000.0+" ms");
            out.println("Bubble Sort is impractical for large datasets.");
            out.println("Merge Sort & Quick Sort perform well.");


        }

    }

}
