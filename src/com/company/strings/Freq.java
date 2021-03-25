package com.company.strings;

import java.util.HashMap;
import java.util.Map;

public class Freq {
    public static void main(String[] args) {
        String str = "i will always be happie and will be  ";

        // Function Call
        count_freq(str);
    }

    private static void count_freq(String str) {
        String[] sa= str.split(" ");
        Map<String, Integer> mp= new HashMap<>();
        for(String s :sa){
            if(mp.containsKey(s)){
                mp.put(s , mp.get(s)+1);
            }
            else {
                mp.put(s, 1);
            }
        }
        System.out.println("words and frequency are");
        mp.forEach((k, v) -> System.out.println(k+"  freq = "+v));

        System.out.println("repeated words   ");
        for (Map.Entry enrty: mp.entrySet()){
            if((int)enrty.getValue()>1){
                System.out.println(enrty.getKey()+" freq :"+enrty.getValue());
        }
    }
}}
