package com.count_sort;

    import java.util.Arrays;

    public class CountingSortAges {
        public static void countingSort(int[] ages) {
            int minAge = 10;
            int maxAge = 18;
            int range = maxAge - minAge + 1;

            // Step 1: Create and populate the count array
            int[] count = new int[range];
            for (int age : ages) {
                count[age - minAge]++;
            }

            // Step 2: Compute cumulative frequencies
            for (int i = 1; i < range; i++) {
                count[i] += count[i - 1];
            }

            // Step 3: Place elements in their correct positions
            int[] sortedAges = new int[ages.length];
            for (int i = ages.length - 1; i >= 0; i--) {
                int age = ages[i];
                sortedAges[count[age - minAge] - 1] = age;
                count[age - minAge]--;
            }

            // Copy sorted array back to original array
            System.arraycopy(sortedAges, 0, ages, 0, ages.length);
        }

        public static void main(String[] args) {
            int[] ages = {12, 15, 10, 18, 14, 13, 15, 12, 17, 10};
            System.out.println("Before sorting: " + Arrays.toString(ages));
            countingSort(ages);
            System.out.println("After sorting: " + Arrays.toString(ages));
        }
    }


