package com.company.strings;
 class A{
     int a;
     int b;

     public A(int a, int b) {
         this.a = a;
         this.b = b;
     }
 }
public class PassBy {
     public static void m1(A a1){
      a1.a*=a1.a;
      a1.b*=a1.b;
     }
     public static  void m2(int i, int j){
         i=i*j;
         j=i*j;
     }

    public static void main(String[] args) {
      A a1=new A(2,4);
        m1(a1);
        System.out.println("a:  "+a1.a+"   b:  "+a1.b);
        System.out.println();

        int i=2, j=2;
        m2(i,j);
        System.out.println("i:  "+i+"  j: "+j);
        System.out.println();

        m2(a1.a, a1.b);
        System.out.println("a:  "+a1.a+"   b:  "+a1.b);
    }
}
