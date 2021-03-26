package com.company.arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] ar = {1, 5, 6, 7, 3,9};
        for (int i: ar){
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("after rotation");
        rotate(ar, 3);
    }

    private static void rotate(int[] ar, int r) {
        int[] arr = new int[ar.length];
        for (int i=0; i<ar.length; i++){
            arr[i]= ar[(i+r)%ar.length];
            System.out.print(arr[i]+" ");
        }


    }
}
