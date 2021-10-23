package com.company;
 //figMD coding Round
class Main {

    public static void main(String[] args) {
      int[] array = {1,17,9,3,5,7,12,17,11,18,19};
        findIndex(array);

    }
     static void findIndex(int[] array) {
         boolean flag = false;
         int[] prime = new int[array.length];
         int k = 0;
         for (int i = 0; i < array.length; i++) {
             for (int j = 2; j < array[i] / 2; j++) {
                 if (array[i] % j == 0) {
                     prime[k++] = array[i];
                     //flag= true;
                     // System.out.println( array[i]+"  is a prime number");
                 }
             }
             if (flag != true) {
                 System.out.println(array[i] + "  is not a prime number");

             }
         }
         //  System.out.println(array[i]);
     }
          //if (flag==false){
          //    System.out.println("given number is not pressent in array");
         // }



}


