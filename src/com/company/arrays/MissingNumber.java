package com.company.arrays;

public class MissingNumber {


    public static void main(String args[])
    {
        int a[] = { 1, 2, 4, 5, 6 };
        int miss = getMissingNo(a, 5);
        System.out.println(miss);
    }

    private static int getMissingNo(int[] a, int n) {

        int total = (n+1)*(n)/2;
        for (int i = 0; i <a.length; i++)
        {
            total=Math.abs(total-a[i]); // it was giving -ve so ussed math.abs
        }
        return total;

    }
}
