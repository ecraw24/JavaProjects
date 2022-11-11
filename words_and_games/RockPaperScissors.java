//Programming Assignment 3
//Title: Rock, Paper, Scissors
//Created by: Emma Crawford
//Date created: 2/8/2021

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		//Set variables
		final int rock =     0; 
		final int paper =    1; 
		final int scissors = 2; 
		String computer = null;
		String usertxt =  null;
		
		//Generate random integer and convert to text (RPS)
		int random = (int) (Math.random()*3); 
		System.out.println(random); 
		switch (random) {
		case     rock: computer = "rock"; break; 
		case    paper: computer = "paper"; break; 
		case scissors: computer = "scissors"; break; 
		}
		
		//Get user input for rock-paper-scissors and convert to text (RPS)
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter 0 for rock, 1 for paper, and 2 for scissors: "); 
		int user = input.nextInt(); 
		switch (user) {
		case     rock: usertxt = "rock"; break; 
		case    paper: usertxt = "paper"; break; 
		case scissors: usertxt = "scissors";
			break;
	}
		//Compare input and print results
		if (user==random) {
			System.out.println("You draw! The computer chose " + computer + " and you chose " + usertxt + "."); 
		}
		else if ((user - random) == -2 || (user - random) == 1) {
			System.out.println("You won! The computer chose " + computer + " and you chose " + usertxt + "."); 
		}
		else {
			System.out.println("You lose! The computer chose " + computer + " and you chose " + usertxt + ".");
		}
		input.close();
	}
		 
		}
