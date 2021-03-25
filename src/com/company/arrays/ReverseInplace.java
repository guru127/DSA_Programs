package com.company.arrays;

import java.util.Arrays;

public class ReverseInplace {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,};
        reverse(a);
    }


    public static void reverse(int[] input) {
        System.out.println("original array : " + Arrays.toString(input));

        // handling null, empty and one element array
        if(input == null || input.length <= 1){
            return;
        }

        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i]; // swap numbers
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }

        System.out.println("reversed array : " + Arrays.toString(input));
    }
}