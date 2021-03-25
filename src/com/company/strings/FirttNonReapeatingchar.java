package com.company.strings;

public class FirttNonReapeatingchar {
    public static void main(String[] args) {
        firstNonReapingChar("gurruchar");
    }

    private static void firstNonReapingChar(String str) {
        int count =0;
        for (int i=0; i<str.length(); i++){
            for(int j=str.length()-1; j>i; j--){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count!=0){
                count=0;
            }else{
                System.out.println(str.charAt(i));
                return;
            }

        }
    }
}
