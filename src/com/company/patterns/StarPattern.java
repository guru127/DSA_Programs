package com.company.patterns;

public class StarPattern {
    /** * * * *
     * * * *
     * * *
     * *
     **/
    public static  void pattern(int n){
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                System.out.print( "*  ");
            }
            System.out.println();
        }
    }
    /**
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void pattern1(int n){
        for (int i=0; i<n; i++){
            for (int j=i; j>=0; j--){
                System.out.print( "*  ");
            }
            System.out.println();
        }
    }
    /*  * * * * *
        * * * *
        * * *
        * *
        *     */
    private static void pattern2(int n) {
        for (int i=0; i<n; i++){
            for (int j=n; j-i>0; j--){
                System.out.print( "  ");
            }
            System.out.println();
        }
    }
    /*
         *
        * *
       * * *
      * * * *
     * * * * *
     */
    private static void pyramid(int n) {
        for (int i=0; i<n; i++){
            for(int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
/*        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<n; i++){

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--){
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ ) {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
*/
    }
    /*     * * * * *
            * * * *
             * * *
              * *
               *
    */
    public static void invPyramid(int n){
        for (int i=1; i<=n; i++){
            for(int j=i; j>=1; j--){
            System.out.print(" ");
           }
            for (int j=n; j>=i; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //pattern(5);
       // pattern1(5);
        //  pattern2(5);
      //    pyramid(5);
      invPyramid(5);
    }


}
