//Programming Assignment 4
//Purpose: Craps Game
//Created by: Emma Crawford
//Date: February 22, 2021

import java.util.Scanner;

public class VegasCraps {

	public static void main(String[] args) { 
		
		//Set first sum variable
		int sum;
		
		//Input scanner and get initial user input (y/n)
		Scanner user = new Scanner(System.in); 
		System.out.println("Shall we play craps? (Enter y or n)"); 
		String input = user.next();
		
		//First roll of the dice
		while (input.equals("y")) {
			int die1 = (int) (Math.random()*5 + 1);
			int die2 = (int) (Math.random()*5 + 1);
			sum = die1 + die2;  
		
		//Win on the first roll (7 or 11)	
		if (sum == 7 || sum == 11) {
			System.out.println("You win! You rolled " + die1 + " and " + die2 + " which is " + sum + "!");
			System.out.println("Do you want to play again? (y or n)"); 
			input = user.next(); 
		
		//Lose on the first roll (2, 3, or 12) 
		} else if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("Crap! You lose! You rolled " + die1 + " and " + die2 + " which is " + sum + "!"); 
			System.out.println("Do you want to play again? (y or n)");  
			input = user.next();
		
		//Print point value and continue to the next roll 
		} else { 
			System.out.println("You rolled " + die1 + " and " + die2 + ". Your point value is " + sum + "."); 
			boolean next = true; 
			
			//Continued rolls if neither win nor lose
			do {    
				int nextDie1 = (int) (Math.random()*5 + 1);
				int nextDie2 = (int) (Math.random()*5 + 1);
				int nextSum = nextDie1 + nextDie2; 
				
				//Win if the next roll equals the point value 
				if (sum == nextSum) {
					System.out.println("You rolled " + nextDie1 + " and " + nextDie2 + " which is " + nextSum + ". Your point value is " + sum + ". You win!");
					System.out.println("Do you want to play again? (y or n)");  
					input = user.next();  
					next = false;
				
				//Lose if the next roll equals 7
				} else if (nextSum == 7) {
					System.out.println("You rolled " + nextDie1 + " and " + nextDie2 + " which is "  + nextSum + ". Crap! You lost!");
					System.out.println("Do you want to play again? (y or n)");  
					input = user.next();  
					next = false;
					
				//Continue rolling if the total neither equals 7 nor the point value
				} else { 
					System.out.println("You rolled " + nextDie1 + " and " + nextDie2 + " which is " + nextSum + "."); 
					continue;  	
				}
				
			} while (next == true); 
		} 
		} 
		
		//close user resource
		user.close(); 
	}
}				
