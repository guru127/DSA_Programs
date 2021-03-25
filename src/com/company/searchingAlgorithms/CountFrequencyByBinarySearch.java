package com.company.searchingAlgorithms;

import java.util.Scanner;

public class CountFrequencyByBinarySearch {
    static int binarySearch(int arr[], int left, int right, int i)
    {
        if (right < left)
            return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == i)
            return mid;
        if (arr[mid] > i)
            return binarySearch(arr, left,  mid - 1, i);
        return binarySearch(arr, mid + 1, right, i);
    }

    static int countFreq(int arr[],  int size, int num)
    {
        int index = binarySearch(arr, 0,  size - 1, num);
        if (index == -1)
            return 0;

        int freq = 1;
        int left = index - 1;
        while (left >= 0 &&  arr[left] == num)
        {
            freq++;
            left--;
        }

        int right = index + 1;
        while (right < size &&  arr[right] == num)
        {
            freq++;
            right++;
        }

        return freq;
    }

    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int num = s.nextInt();
        int freq = countFreq(arr, size, num);
        if (freq != 0)
            System.out.print(freq);
        else
            System.out.print("NA");
    }
}
