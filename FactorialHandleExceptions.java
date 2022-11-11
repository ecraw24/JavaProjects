// This program implements the factorial function, where n! = 1*2*...*n
// The value of n is set by the user.
//
// Try running this and entering some good values, bad values, then a negative value.
// For example, enter 5, 10, a, abc, -1.

import java.io.*;
import java.util.*;

public class FactorialHandleExceptions
{
	static Scanner console = new Scanner(System.in);

   public static void main(String[] args)
   {
		boolean done = false;

		// Loop until the user enters a negative number to quit.
		do
		{
			try
			{
				// Prompt the user and read input.
				System.out.println("To quit, enter a negative number.");
				System.out.print("Otherwise, enter a non-negative number to find the factorial:  ");
				int num = console.nextInt();
				
				// If the user enters a negative, number, set boolean to true so loop will exit.
				int fact = 1;
				if (num < 0)
   			{
					done = true;
				}
				else
				{
					// Otherwise, loop num times, doing the factorial multiplication.
	   		   for (int i = 1; i <= num; i++)
					{	
						fact = fact * i;
					}
					
					// Print result.
	   	 		System.out.println(num + "! equals " + fact);
				}
			}
			catch(InputMismatchException imeRef)
			{
				// If the user enters anything other than an integer, an InputMismatchException will be thrown
				// and caught here.
				// Print a nice error message, clear out that bad input, then continue looping.
	  	 		System.out.println("\nException: " + imeRef.toString());
      	   console.nextLine();
       	  	System.out.println("\n\n");
			}
		} 
		while (done == false);
   }
}


