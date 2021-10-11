package com.company.patterns;

public class NumberPattern {
    public static void main(String[] args) {
        //pattern(5);
        pattern1(5);
        pattern2(5);

    }
/*

 1 2 3 4 5
  1 2 3 4
   1 2 3
    1 2
     1

*/
    private static void pattern2(int n){
        System.out.println("pattern2");
      /*  for (int i=0; i<n; i++){
            for (int j=i; j>0; j--){
                System.out.print(" ");
            }
            int p=1;
            for (int j=0; j<i; j++){
                System.out.print(p+++" ");
            }
            System.out.println();
        }*/
        for (int i=0; i<n; i++){
            for (int j=i; j>0; j--){
                System.out.print(" ");
            }
            int p=1;
            for(int j=n; j>i; j--){
                System.out.print(p+++" ");
            }
            System.out.println();
        }
       /* for (int i=0; i<n; i++){
            for (int j=i; j>0; j--){
                System.out.print( " ");
            }int p=1;
            for (int j=n; j>i; j--){
                System.out.print(p+++" ");
            }
            System.out.println();
        }*/
    }

    /*
    1
   1 2
  1 2 3
 1 2 3 4

     */
    private static void pattern1(int n) {
        System.out.println("pattern1");
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
       /* for (int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
     */
    private static void pattern(int n) {
        for (int i=0; i<n; i++){
            for (int j=1; j<i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
