package com.company.strings;

public class OnlyDigits {
    public static boolean
    onlyDigits(String str, int n)
    {
boolean b= true;
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {

            // Check if the sepecified
            // character is a digit then
            // return true,
            // else return false
            if (!Character.isDigit(str.charAt(i))) {
                b=false;
            }
        }
        return b;
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given string str
        String str = "126544";
        int len = str.length();
           isDigit(str);

        // Function Call
      //  System.out.println(onlyDigits(str, len));
    }

    private static void isDigit(String str) {
        boolean flag = true;
        for(int i=0; i<str.length(); i++){
            if(!(str.charAt(i)>=0&&str.charAt(i)<10)){
                flag=false;
            }
            if(flag==false){
                System.out.println("not ");
                return ;
            }
        }
    }
}
