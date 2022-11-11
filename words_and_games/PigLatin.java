//Programming Assignment 3
//Translate to pig-latin
//Created by: Emma Crawford
//Date created: 02/15/2021

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
	
	//Get user input (lowercase or uppercase)	
	Scanner rawinput = new Scanner(System.in); 
	System.out.println("Please enter a word to be translated to pig-latin: "); 
	String input = rawinput.nextLine();
	String word = input.toLowerCase(); 
	
	//Assign first and first+second characters to a variable
	char char1 = word.charAt(0); 
	String chartwo = word.substring(0,2);  

	//If-else statements for 1) consonant clusters, 2) vowels, and 3) other; Print result
	if (chartwo.equals("bl") || chartwo.equals("br") || chartwo.equals("ch") || chartwo.equals("cl") || chartwo.equals("cr") || 
	    chartwo.equals("dr") || chartwo.equals("fl") || chartwo.equals("fr") || chartwo.equals("gl") || chartwo.equals("gr") || 
	    chartwo.equals("kl") || chartwo.equals("ph") || chartwo.equals("pl") || chartwo.equals("pr") || chartwo.equals("sh") || 
		chartwo.equals("sl") || chartwo.equals("sp") || chartwo.equals("sr") || chartwo.equals("st") || chartwo.equals("th") || 
		chartwo.equals("tr") || chartwo.equals("wh") || chartwo.equals("wr")) { 
		System.out.println(input.substring(2) + chartwo + "ay");  
	} else if (char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u') {
		System.out.println(input + "yay");  
	} else {
		System.out.println(input.substring(1) + char1 + "ay");  
	}
	
	rawinput.close(); 
	
	}
}
