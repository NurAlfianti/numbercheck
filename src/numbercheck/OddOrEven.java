package numbercheck;

//Import package
import java.util.Scanner;

public class OddOrEven 
{        
    
    public static void CheckOddOrEven() 
    {
        System.out.println("enter an integer to check if even or odd");
       int x;
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      if ( x % 2 == 0 )
         System.out.println("The number entered is an even number.");
      else
         System.out.println("The number entered is an odd number."); 
      
    }

}
