package com.company.sortingAlgorithms;

// t-- O(n*2)

class SelectionSort {
    void sort(int arr[])
    {

        int count =0;
        for ( int i =0; i<arr.length; i++){
            int minIndex=i;

            for (int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    minIndex=j;
                }
            }

            if( minIndex!=i){
                count++;
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }

        }System.out.println(" swaps"+count);

    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {1,2,5,4};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}