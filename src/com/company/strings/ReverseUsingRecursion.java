package com.company.strings;

public class ReverseUsingRecursion {
        //using recursion
        public static void main(String[] args) {
            reverse("gurucharana");
        }

        private static void reverse(String str) {
            if(str.length()<=1|| str==null){
                System.out.println(str);
            }else{
                System.out.print(str.charAt(str.length()-1));
                reverse(str.substring(0, str.length()-1));
            }
        }
    }
