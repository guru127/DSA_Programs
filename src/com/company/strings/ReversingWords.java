package com.company.strings;

public class ReversingWords {
    public static void main(String[] args) {
        String s =" hai helo namaskara";
        rev(s);
    }

    private static void rev(String s) {

        if (s.length()==0){
            System.out.println(" ");
        }
        else if(s==null){
             System.out.println(" ");
        }
         else{
             String [] sr= s.split(" ");
             for (int i=sr.length-1; i>0; i--){
                 System.out.print(sr[i]+" ");
             }
         }
    }
}
