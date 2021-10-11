package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        /*Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();*/
        String s= "abceade";
        System.out.println(subString(s));

    }

    private static int subString(String s) {
        int res =0;
        char[] sa= s.toCharArray();
        int n1=0;
        int n2=0;

        for (int i=1; i<s.length(); i++){
            n1=0;
            for(int j =i-1; j>=0; j--){
                if(sa[i]==sa[j]){
                    res= Math.max(n1, n2);
                    }
                else {
                    n1++;
                    if (n1>n2){
                        n2=n1;
                    }
                }
            }
        }
        return n2;
    }
}


