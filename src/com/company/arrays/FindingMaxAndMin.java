package com.company.arrays;

public class FindingMaxAndMin {
    public static void maxAndMin(int[] arr){
        int max=arr[0], min=arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max = "+ max+", min = "+min);
    }
    public static void main(String[] args) {
       int[] arr={4, 7, 3, 5, 8, 2 , 1, 0, 9};
       maxAndMin(arr);
    }
}
