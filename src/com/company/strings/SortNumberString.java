package com.company.strings;

import java.util.Arrays;

public class SortNumberString {
    public static void main(String[] args) {

    /*    int a=0,b,c=2;
        int sum = 0;
        try{
            if(a>c)
                throw  new RuntimeException();
        }catch ( RuntimeException e){
            sum=a+b+c;
        }*/
       StringBuilder s1= new StringBuilder("1");
       StringBuilder s2= new StringBuilder(1);
       String s3 =s2.substring(0);
       char s4 = s1.charAt(0);
       String s5= s4+"".intern();
       String s6 = s5.concat(s3.concat((s4+"").replace("1","2")));
       System.out.println(s6);

    /*
      //
      String s = "1,3,2,7,5";

        System.out.println(sort(s));
    }

    private static String sort(String S) {
        String[] a= S.split(",");

        Arrays.sort(a);
        String result = String.join(",", a);
        return result;*/
    }
}
