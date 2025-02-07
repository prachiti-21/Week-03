package com.bigo.comparesorting;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        try {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Attempted to access an invalid index.");
        } catch (OutOfMemoryError e) {
            System.err.println("Error: Not enough memory to sort this dataset.");
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());

        }
        return arr;
    }


}
