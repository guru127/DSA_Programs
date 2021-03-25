package com.company.arrays;

import java.util.Arrays;

public class AlternateArrangment {
    public static void main(String[] args) {
        int[] arr={4, 7, 3, 5, 8, 2 , 1, 0, 9};
        sortAlternativly(arr);
    }

    private static void sortAlternativly(int[] arr) {
        Arrays.sort(arr);
  ;     int n= arr.length;
        int[] ar=new int[n];
        int index=0;
        for (int i = 0, j = n-1; i <= n / 2 || j > n / 2; i++, j--) {
           if(index < n){
               ar[index] = arr[i];
               index++;
           }
            if(index < n){
                ar[index] = arr[j];
                index++;
            }

        }
        for (int i=0; i<n; i++){
            arr[i]=ar[i];
            System.out.println(arr[i]);
        }

    }
}
