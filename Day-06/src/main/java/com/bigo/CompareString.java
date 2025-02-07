package com.bigo;

import com.bigo.comparesorting.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class CompareString {
    public static String string(String[]arr){
        String result="";
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        return result;
    }
    public static String stringBuilder(String[] arr){
        StringBuilder sb=new StringBuilder();

        for(String s: arr){
            sb.append(s);
        }
        return sb.toString();
    }
    public static String stringBuffer(String[] arr){
        StringBuffer sb=new StringBuffer();

        for(String s:arr){
            sb.append(s);
        }
        return sb.toString();

    }



    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 100000};


        for (int s : sizes) {
            String [] dataset=new String[s];
            for(int i=0;i<s;i++){
              dataset[i]= Integer.toString(i);
            }
            //execution time for string
            long startTime= System.nanoTime();
            string(dataset);
            long stringTime= System.nanoTime()-startTime;

            //execution time for StringBuffer
            startTime=System.nanoTime();
            stringBuffer(dataset);
            long bufferTime=System.nanoTime()-startTime;

            //execution time for StringBuilder
            startTime=System.nanoTime();
            stringBuilder(dataset);
            long builderTime=System.nanoTime()-startTime;

            System.out.println("Dataset size: "+s);
            System.out.println("Execution time for String: "+stringTime/1_000_000+" ms");
            System.out.println("Execution time for StringBuffer: "+bufferTime/1_000_000+" ms");
            System.out.println("Execution time for StringBuffer: "+builderTime/1_000_000+" ms");
            System.out.println("StringBuilder & StringBuffer are much more efficient than String.");
            System.out.println("Use StringBuilder for single-threaded operations and StringBuffer for multi-threaded.");

        }
}
    }
