/*
       * 
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 */

import java.util.*;

public class pattern11{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int num = sc.nextInt();
        
        for(int i = 1; i<=num; i++){
            for(int j = i; j<=num; j++)
            System.out.print(" ");
            for(int k = 1; k<=i; k++)
            System.out.print("* ");
            

            System.out.println();
        }

         
        sc.close();
    }
}
