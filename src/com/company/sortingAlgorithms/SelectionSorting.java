package com.company.sortingAlgorithms;

public class SelectionSorting {

    public static void main(String args[])
    {
       SelectionSorting selection = new SelectionSorting();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        selection.sort(arr);
        System.out.println("Sorted array");
        for (int i: arr){
            System.out.println(i);
        }
    }

    private void sort(int[] arr) {
        int n = arr.length;
        for (int i =0; i <n; i++){
            int minIdex =i;
            for (int j=i+1; j < n; j++){
                if (arr[j]< arr[minIdex]){
                    minIdex=j;
                }
            }
                if(minIdex!=i){
                    int temp = arr[minIdex];
                    arr[minIdex]= arr[i];
                    arr[i]=temp;
                }
            }

        }

    }

