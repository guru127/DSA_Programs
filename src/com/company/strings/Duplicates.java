package com.company.strings;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static void main(String[] args) {
        String s= "haii helo namaskara sir";
        printDuplicates(s);
    }

    private static void printDuplicates(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!mp.containsKey(str.charAt(i)))
                    mp.put(str.charAt(i), 1);
                else
                    mp.put(str.charAt(i),
                            mp.get(str.charAt(i)) + 1);
            }
        }
        // to print frq of each words
        mp.forEach((k,v) -> System.out.println("char "+k+" freq "+v));

        System.out.println(" ........result...... ");

        /*Print duplicates in sorted order*/
        for (Map.Entry map : mp.entrySet()){
            char c = (char) map.getKey();
            int i= (int) map.getValue();
            if (i>1){
                System.out.println( c +"   "+ i);

            }
        }
    }
}