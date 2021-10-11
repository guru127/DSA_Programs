package com.company.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeating {

    public static void main(String []args){
     /*   Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }*/
        int[] arr = {3,1,4,1,6,3,4,1,8};
        int answer = firstNonRepeating(arr);
        if (answer != 0)
            System.out.print(answer);
        else
            System.out.print("All elements are repeated");


        System.out.println(" rep number   ........");
        rep(arr);
    }

    private static void rep(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                System.out.println(arr[i]);
                return;
            }else{
                set.add(arr[i]);
            }
        }
    }

    static int firstNonRepeating(int arr[]) {
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
            }
            if (j == n) {
                return arr[i];
            }
        }
        return 0;

    }
}
