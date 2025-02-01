package com.hash_map.subarrays_with_zero_sum;
import java.util.*;

public class SubarraysWithZeroSum {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        sumMap.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumMap.containsKey(sum)) {
                for (int start : sumMap.get(sum)) {
                    result.add(Arrays.copyOfRange(arr, start + 1, i + 1));
                }
            }

            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4, -2, -2};
        List<int[]> subarrays = findZeroSumSubarrays(arr);

        for (int[] subarray : subarrays) {
            System.out.println(Arrays.toString(subarray));
        }
    }
}

