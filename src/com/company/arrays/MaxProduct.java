package com.company.arrays;

import java.util.Scanner;

public class MaxProduct {
    private static int maxProduct(int[] arr) {
        int max=0, max2=0, index =0;
        // finding first max
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        // finding 2nd max witch is not equal to 1st max
        for(int i =0; i <arr.length; i++){
            if(arr[i]>max2 && i==max){
                return max*max;
            }
            if (arr[i]> max2 && i!=index){
                max2=arr[i];
            }
        }
        return max*max2;

    }
    public static void main(String[] args) {
    /*Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int[] arr = new int[size];
    for(int i = 0; i < size; i++) {
        arr[i] = s.nextInt();
    }*/
        int[] arr = {1, 2, 7, 5, 3};
       int answer = maxProduct(arr);
    System.out.print(answer);
}

}
