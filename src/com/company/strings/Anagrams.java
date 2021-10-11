package com.company.strings;

import java.util.Arrays;

public class Anagrams {
    /* function to check whether two strings are
        anagram of each other */
    static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        char str1[] = {'t', 'e', 's', 't'};
        char str2[] = {'t', 't', 'e', 'w'};


        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");

        String s1 = "abcd";
        String s2 = "bcda";
        checkAnagram(s1, s2);
    }

    private static void checkAnagram(String s1, String s2) {
        System.out.println("String anagram checking");
        if(s1.length()!=s2.length()){
            System.out.println("not anagrams    ");
            return;
        }
        char[] s1a=s1.toCharArray();
        char[] s2a=s2.toCharArray();

        Arrays.sort(s1a);
        Arrays.sort(s2a);
        for (int i=0; i<s1.length(); i++){
            if(s1a[i]!=s2a[i]){
                System.out.println("not a Anagram   ");
                return;
            }
        }
        System.out.println("its an Anagram");
    }
}
