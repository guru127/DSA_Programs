package com.company.arrays;

public class Fibonacci {
    public static void fab(int n){
        int n1=0;
        int n2=1;
        int n3=0;
        for(int i=0; i<n; i++){
            System.out.print(n1+"  ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println();
        System.out.println("  while loop   ");
        int i1=0;
        int i2=1;
        int i3=0;
        int counter=0;
        while(counter<n){
            System.out.print(i1+"  ");
            i3=i1+i2;
            i1=i2;
            i2=i3;
            counter++;
        }
    }
    private static int fabRecurse(int i) {
        if (i<=1){
           return i;
        }
        else {
            return fabRecurse(i - 1) + fabRecurse(i - 2);

        }

    }
    public static void main(String[] args) {
        fab(6);
        System.out.println();
        System.out.println("recursion..............");
      for (int i=0; i<6; i++){
          System.out.print(fabRecurse(i)+"  ");
      }
    }


}
