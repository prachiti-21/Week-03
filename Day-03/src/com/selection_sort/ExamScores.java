package com.selection_sort;

import java.util.Arrays;

public class ExamScores {
    public static void selectionSort(int scores[]){
        for(int i=0;i<scores.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<scores.length;j++) {
                if (scores[j] < scores[smallest]) {
                    smallest = j;
                }
            }
                int temp=scores[smallest];
                scores[smallest]=scores[i];
                scores[i]=temp;
            }

        }


    public static void main(String[] args) {
        int scores[]={90,70,80,85,76,98};
        ExamScores.selectionSort(scores);
        System.out.println(Arrays.toString(scores));
    }
}
