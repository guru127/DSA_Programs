package com.company.strings;

import java.util.Scanner;

public class Permutations {
    public static  void stringPermutations(String str, int left, int right) {

        if (left==right){
            System.out.println(str);
        }else{
            for (int i=left; i<=right; i++){
                str= swap(str, left, i);
                stringPermutations(str, left+1, right);
                str= swap(str, left, i);
            }
        }
    }
    private static String swap(String str, int i, int j) {
        char[] ca=str.toCharArray();
        char tem = ca[i];
        ca[i]=ca[j];
        ca[j]=tem;
        return String.valueOf(ca);
    }

    public static void main(String args[]) {
    //    Scanner sc = new Scanner(System.in);
      //  String str = sc.nextLine();
        String str = "abc";
        int len = str.length();
        if(len <= 3)
            stringPermutations(str,0,len-1);
        else
            System.out.print("NA");
    }
}
