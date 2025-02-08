package com.bigo;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class CompareSearch {
    public static int linearSearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int hashSetSearch(HashSet<Integer> set, int target) {
        if (set.contains(target)) {
            return target;
        }
        return -1;
    }

    public static int treeSetSearch(TreeSet<Integer> ts, int target) {
        ts.add(10);
        ts.add(50);
        ts.add(20);
        ts.add(30);
        if (ts.contains(target)) {
            return target;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 100000};

        Random random = new Random();
        for (int s : sizes) {
            int[] dataset = new int[s];
            for (int i = 0; i < s; i++) {
                dataset[i] = random.nextInt(s * 10);
            }
            int target = dataset[random.nextInt(s)];

            //linear search execution time
            double startTime = System.nanoTime();
            linearSearch(dataset, target);
            double linearTime = System.nanoTime() - startTime;
            System.out.println("Dataset size: " + s);
            System.out.println("Exceution time for array linear search: " + linearTime/1_000_000+ " ms");

            //hashset execution time
            startTime = System.nanoTime();
            hashSetSearch(new HashSet<>(), target);
            double hashTime = System.nanoTime() - startTime;
            System.out.println("Exceution time for HashSet search: " + hashTime/1_000_000+ " ms");
            //treeset execution time
            startTime = System.nanoTime();
            treeSetSearch(new TreeSet<>(), target);
            double treeTime = System.nanoTime() - startTime;
            System.out.println("Exceution time for TreeSet search: " + treeTime/1_000_000+ " ms");

        }

    }
}
