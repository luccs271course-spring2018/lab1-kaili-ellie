package hw;

import java.util.*;

public class fizzbuzz {

  /** PART TWO

  public static void printFizzBuzz(int n) {

    for (int i = 1; i <= n; i++) {
      int x = i % 3;
      int y = i % 5;

      if (x == 0 && y == 0) {

        System.out.println("fizz buzz");

      } else if (x == 0) {

        System.out.println("fizz");

      } else if (y == 0) {

        System.out.println("buzz");

      } else {

        System.out.println(i);
      }
      
    }

  }
  
  **/

  /** PART THREE

   public static String[] fizzBuzz(int n) {

    if (n >= 1) {

      String[] list = new String[n];

      for (int i = 1; i <= n; i++) {
        int x = i % 3;
        int y = i % 5;

        if (x == 0 && y == 0) {

          list[i] = "fizz buzz";

        } else if (x == 0) {

          list[i] = "fizz";

         } else if (y == 0) {

           list[i] = "buzz";

         } else {

           list[i] = String.valueOf(i);
         }
        
       }
      
       return list;

     } else {
      
       System.out.println("Invalid");
       return null;
     }
    
   }
   
  **/
   
  /**
  
  // PART FOUR */

  public static ArrayList<String> fizzBuzz(int n) {
    
    if (n >= 1) {
      
      ArrayList<String> list = new ArrayList<String>(n);

      for (int i = 1; i <= n; i++) {
        int x = i % 3;
        int y = i % 5;

        if (x == 0 && y == 0) {

          list.add("fizz buzz");

        } else if (x == 0) {

          list.add("fizz");

        } else if (y == 0) {

          list.add("buzz");

        } else {

          list.add(String.valueOf(i));
        }
      }

      return list;

    } else {
      
      System.out.println("Invalid");
      return null;
      
    }
    
  }
  
}
