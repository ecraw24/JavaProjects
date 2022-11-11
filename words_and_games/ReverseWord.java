// Emma Crawford, Josiah Siebring
// Lab 5
// Print the reverse of a word

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		//Get a word from the user and determine its length (in characters)
		Scanner input = new Scanner(System.in); 
		System.out.println("Please enter a word or sentence to reverse: "); 
		String word = input.nextLine(); 
		int length = word.length() - 1; 
		
		//Set the variable "reverse" and add the word's characters to the variable in reverse order
		String reverse = ""; 
		for (int i = length; i >= 0; i--) {
			reverse = reverse + word.charAt(i); 
		}
		
		//Print the word in reverse
		System.out.print(reverse);
		
		//Close the input variable
		input.close(); 
	}
}
