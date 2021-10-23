
package com.company.arrays;

import java.util.*;

public class TestClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1= sc.nextInt();
        String s= sc.nextLine();
        int k=i1%10;
        int n1=0;
        int n2=0;

        for(int i=k; i<s.length(); i++){
            int r=k;
            n1=0;
            for(int j=i-1; j>=0; j--){
                if (s.charAt(i)!=s.charAt(j)&& r==0){
                    n1=i;
                }else if(s.charAt(i)!=s.charAt(j)&& r!=0){
                    r--;
                }else{
                    n1++;
                }
            }
            if(n1>n2){
                n2=n1;
            }

        }

    }
}