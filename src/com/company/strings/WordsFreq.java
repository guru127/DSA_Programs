package com.company.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordsFreq {

    // Function to count frequency of
    // words in the given string
    static void count_freq(String str){
        System.out.println(str);
        char[] cr = str.toCharArray();

        Map<Character , Integer> mp = new HashMap<>();
        for(int i=0; i<cr.length; i++){
            if(mp.containsKey(cr[i])){
                mp.put(cr[i], mp.get(cr[i])+1);
            }else{
                mp.put(cr[i], 1);
            }
        }
        System.out.println("printing each char freq ");
        mp.forEach((k,v)-> System.out.println(k+"  :  "+v));

        System.out.println("printing dup char freq  ");
        for (Map.Entry entry: mp.entrySet()){
          if((int)entry.getValue()>1) {
              System.out.println(entry.getKey()+"  :  "+ entry.getValue());
          }
        }

    /*    Map<String,Integer> mp=new TreeMap<>();

        // Splitting to find the word
        String arr[]=str.split(" ");

        // Loop to iterate over the words
        for(int i=0;i<arr.length;i++)
        {
            // Condition to check if the
            // array element is present
            // the hash-map
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }

        // Loop to iterate over the
        // elements of the map
        for(Map.Entry<String,Integer> entry:
                mp.entrySet())
        {
            System.out.println(entry.getKey()+
                    " - "+entry.getValue());
        }

        System.out.println("dup chars  ");*/
    }

    // Driver Code
    public static void main(String[] args) {
        String str = "Geeks For Geeks";
        String str2 = "i will always be happie";

        // Function Call
        count_freq(str);
        System.out.println("   ");
        count_freq(str2);
    }

}
