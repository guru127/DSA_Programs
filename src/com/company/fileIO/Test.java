package com.company.fileIO;

import java.util.HashMap;
import java.util.Map;

public class Test {


    public static void main(String[] args) {
        String s= "TestJavaTest";
        checkCharFreq(s);
    }

    private static void checkCharFreq(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!mp.containsKey(s.charAt(i))) {
                mp.put(s.charAt(i), 1);
            } else {
                mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
            }
        }

        mp.forEach((k, v) -> System.out.println(k + "  freq =  " + v));
    }
}
/*   for (Map.Entry entry: mp.entrySet()){

        }*//*


    }
}
se/*lect * from Students where roll_number between 200 and 600;
slelct * from students
*/
