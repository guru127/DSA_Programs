package com.company.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintingDplicates {
    public static void main(String []args) {
    /*Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int[] arr = new int[size];
    for(int i = 0; i < size; i++) {
        arr[i] = s.nextInt();
    }*/
        int [] arr = {1, 3, 4, 3, 1, 5, 4, 7, 1, 8};
        printDuplicates(arr);
}
    static void printDuplicates(int arr[]) {
        int counter=0;
        for(int i=0;i<arr.length;i++) {
            for(int j =i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    counter++;
                }
            }
            if(counter==1)  // this ensures that a number wont print twice
                System.out.println(arr[i]);
            counter = 0;
        }
    }

}
