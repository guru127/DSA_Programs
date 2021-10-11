package com.company.sortingAlgorithms;

// wt -O(n*n) reverse sorted array
// bt -O(n) already sorted array

public class BubbleSort {

    private void bubbleSort(int[] arr) {
        for (int i =0; i<arr.length-1; i++ ){
            for (int j=0; j<arr.length-i-1; j++){

                if (arr[j]>arr[j+1]){

                    int temp= arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array  ");
        for (int i: arr){
            System.out.println(i);
        }
    }

}