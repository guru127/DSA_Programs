package com.company.arrays;

public class SummingPairs {
    public static void main(String args[]) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        getPairsCount(arr, sum);
    }
    public static void getPairsCount(int[] arr, int sum)
    {
        int count = 0;
        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    System.out.println(arr[i] + "  and " + arr[j]);
                    count++;
                }
            }
        }

        System.out.println("Count of pairs is "+ count);
    }
}
