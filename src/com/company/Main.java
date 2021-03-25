package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s= "a";
        String s1= new String("a");
        System.out.println(s==s1);
        s=s+"b";
        System.out.println(s +"   ==  "+ s.hashCode());
        s=s+"c";
        System.out.println(s +"   ==  "+ s.hashCode());
        s=s+"d";
        System.out.println(s +"   ==  "+ s.hashCode());
    }
}
