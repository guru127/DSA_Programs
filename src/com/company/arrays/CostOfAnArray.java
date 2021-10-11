package com.company.arrays;

public class CostOfAnArray {
    public static void main(String[] args) {
        int[] a1={5, 4, 3, 2, 1};
        int [] a= new int[a1.length+1];
        for(int i=1; i<=a1.length; i++){
            a[i]=a1[i-1];
        }
        System.out.println(costOfArray(a1.length, a));
    }

    private static int costOfArray(int N, int[] A) {

       int cost=0;
       for(int i=1; i<=N; i++){
           cost+=i*A[i];
       }

       return cost;


    }
}
