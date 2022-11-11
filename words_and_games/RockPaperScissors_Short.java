import java.util.Scanner;

public class RockPaperScissors_Short {

	public static void main(String[] args) {
		
		//Set constant variables
		final int rock = 0; 
		final int paper = 1; 
		final int scissors = 2; 
		
		//Generate random integer and assign rock-paper-scissors
		int random = (int) (Math.random()*3); 
		System.out.println(random); 

		//Get user input for rock-paper-scissors
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter 0 for rock, 1 for paper, and 2 for scissors: "); 
		int user = input.nextInt(); 

		//Compare results
		switch (random) {
		case rock: 
			switch (user) {
			case rock: System.out.println("You draw! You chose rock and the computer chose rock."); break; 
			case paper: System.out.println("You win! You chose paper and the computer chose rock."); break;
			case scissors: System.out.println("You lose! You chose scissors and the computer chose rock."); break;
			}
		case paper: 
			switch (user) {
			case rock: System.out.println("You lose! You chose rock and the computer chose paper."); break; 
			case paper: System.out.println("You draw! You chose paper and the computer chose paper."); break;
			case scissors: System.out.println("You win! You chose scissors and the computer chose paper."); break;
			}
		case scissors: 
			switch (user) {
			case rock: System.out.println("You win! You chose rock and the computer chose scissors."); break; 
			case paper: System.out.println("You lose! You chose paper and the computer chose scissors."); break;
			case scissors: System.out.println("You draw! You chose scissors and the computer chose scissors."); break;
			}
		}
		
		
		input.close(); 
		
}
}

			
			
	
	/*	if (user==random) {
			System.out.println("You draw! The computer chose " + computer + " and you chose " + usertxt + "."); 
		}
		else if ((user - random) == -2 || (user - random) == 1) {
			System.out.println("You won! The computer chose " + computer + " and you chose " + usertxt + "."); 
		}
		else {
			System.out.println("You lose! The computer chose " + computer + " and you chose " + usertxt + ".");
		}
		input.close(); */
			
			
		 

//win if:   0 2;  1 0; 2 1;  
//lose if:   0 1; 1 2; 2 0;

/* Write a program that plays the game of rock-paper-scissors.  Rules: scissors can cut paper, a rock can break scissors, and paper can cover a rock.
Requirements:

1. Your program should randomly generate a number between 0 and 2 representing rock, paper or scissors.
2. Prompt the user to enter a number between 0 and 2, then display a message indicating whether the user wins, the computer wins, or there is a draw.
3. Use constants for 0, 1 and 2 instead of having numbers all over your program.
4. Add comments to your program starting with your name at the top, then throughout your program to describe what you are doing.  Be sure and declare all the variables you need and make your calculations clear.  Give your variables meaningful names.
5. Be sure to indent consistently throughout your program to make it more readable.

Sample output:

Enter a number: rock (0), paper (1), scissor (2): 2
The computer is rock. You are scissors. You lost.

Extra Credit: For 5 points of extra credit, use a switch statement in your program.*/