package com.company.strings;

public class StringPermutations {
    public static void main(String[] args) {
        permute("abc", 0, 2);
    }

    private static void permute(String s, int l, int r) {
        if(l==r){
            System.out.println(s);
        }else{
            for (int i=l; i<=r; i++){
                s=swap(s, l , r);
                permute(s, l+1, r);
                s=swap(s, l , r);

            }
        }
    }
    public static String swap(String s, int l, int r){
        char[] cr = s.toCharArray();
         char c = cr[l];
         cr[l]=cr[r];
         cr[r]=c;

        return String.valueOf(cr);
    }
}
