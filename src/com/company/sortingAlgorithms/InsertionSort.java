package com.company.sortingAlgorithms;

// wt -O(n*n) reverse sorted array
// bt -O(n) already sorted array
public class InsertionSort {
    private static void inSort(int[] arr) {
       // int n =arr.length;
        for(int i=1; i<arr.length; i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key ){
                arr[j+1]= arr[j];
                j=i-1;
            }
            arr[j+1]=key;

        }
        for (int i: arr){
            System.out.println(i);
        }
    }
    private void sort(int[] arr) {
        //int n = arr.length;
        for (int i=1; i<arr.length; i++){
            int key =arr[i];
            int j=i-1;
            while (j>=0 && arr[j] > key){
                arr[j+1]= arr[j];
                j=j-1;
            }
            arr[j+1]= key;
        }
    }

    public static void main(String args[])
    {
       InsertionSort insertionSort = new InsertionSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        insertionSort.sort(arr);
        System.out.println("Sorted array");
        for (int i: arr){
            System.out.println(i);
        }
        System.out.println(" inSort .....................");
        inSort(arr);
    }

}
