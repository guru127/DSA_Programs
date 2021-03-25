package com.company.strings;

public class SubString {
    public static void main(String[] args) {
        String s ="hai helo namaskara";
                 //01234567890
        System.out.println(s);
        System.out.println();
        System.out.println(s.substring(4,7));  // hel (4,5,6)
        System.out.println();
        System.out.println(s.substring(7));   // 7 to end

        String s1 = "a";
        String s2 = "b";
        System.out.println("campare :  "+s1.compareToIgnoreCase(s2));  // -1
        System.out.println("campare :  "+s2.compareToIgnoreCase(s1));  //  1

    }
}
