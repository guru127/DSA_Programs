package com.company.searchingAlgorithms;

import java.util.Scanner;

public class BinarSearch {
// to get unsuccessful attempts
    public int getComparisons(int[] inputArr, int key) {
        // Write your code here
        int s =0;
        int e=inputArr.length-1;
        int m=0;
        int count=0; //counting of unsuccessful attempts
        while (s<=e){
            m=(s+e)/2;
            if (inputArr[m]==key){
                break;
            }
            else {
                count++;
            }
            if (inputArr[m]<key){
                s=m+1;
            }
            if(inputArr[m]>key){
                e=m-1;
            }
        }
        return count;
    }

    public static void main(String args[] ) throws Exception {
        BinarSearch bs = new BinarSearch();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getComparisons(array, key));
    }
}
