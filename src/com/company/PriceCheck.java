package com.company;

import java.util.Arrays;
import java.util.List;

public class PriceCheck {
    public static void main(String[] args) {

         List<String> Ar= Arrays.asList(new String[]{"egg", "milk", "cheese"});
         List<Float> pr= Arrays.asList(new Float[]{2.89f, 3.29f, 5.79f});


         List<String> ps=Arrays.asList(new String[]{"egg","egg", "cheese", "milk"});
        List<Float> sp= Arrays.asList(new Float[]{2.89f ,3.29f, 5.9f, 3.29f});

         int count=0;

         for(int i=0; i<ps.size(); i++){
             String s= ps.get(i);
             for (int j=0; j<Ar.size(); j++){
                 if (Ar.get(j).equals(ps.get(i))){
                     if (sp.get(i) != pr.get(j)) {
                         count++;
                     }
                 }
             }
         }
        System.out.println(count);
    }
}
