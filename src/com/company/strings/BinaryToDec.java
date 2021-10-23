package com.company.strings;

public class BinaryToDec {
    public static void main(String[] args) {
        int b =10101001;
      BinaryDec(b);
    }

    private static void BinaryDec(int b) {
        int n=0;
        int base =1;
        while(b>0){
            int lastDigit=b%10;
            b=b/10;

            n +=lastDigit*base;

            base = base*2;

        }

        System.out.println(n);
    }
}
