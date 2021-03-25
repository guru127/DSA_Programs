package com.company.strings;

public class Palindrome {
    public static void main(String[] args) {
    palindrome("abc");
    palindrome("aba");
    }

    private static void palindrome(String s) {
        boolean flag =true;
        for (int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("yes its a palindrome");
        }else{
            System.out.println("no its not a palindrome");
        }
    }
}
