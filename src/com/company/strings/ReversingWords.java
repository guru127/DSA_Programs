package com.company.strings;

public class ReversingWords {
    public static void main(String[] args) {
        String s =" hai helo namaskara";
        System.out.println("");
        rev(s);
        String sr = "guru";
        reverse(sr);

    }

    private static void reverse(String sr) {
        char[] ar = new char[sr.length()];
        for(int i=0; i<sr.length(); i++){
            ar[i]= sr.charAt(sr.length()-1-i);
            System.out.print(sr.charAt(sr.length()-1-i));
        }
        System.out.println("");
        String s = String.valueOf(ar);
        System.out.println("  string ----------"+s);

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
