import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

	//Set up variables and Scanner
	Scanner input = new Scanner(System.in); 
	String[] wordList = loadWords(); 
	int wordsIndex; 
	String word; 
	StringBuilder hiddenWord; 
	
	//Counts
	int nullCount = 0; 
	int replacements = 0; 
	int correctLetters = 0; 
	int misses = 0; 
	
	//Play again variable
	char playAgain;
	
	//Loop to play again
	do {
	
		//Get word list
		do {
			hiddenWord = new StringBuilder(""); 
			wordsIndex = (int)(Math.random()*12); 
			word = wordList[wordsIndex];
			
			//Count nulls to avoid repeats
			nullCount++; 
			if (nullCount == 12) {
				break; 
			}
			
		} while (wordList[wordsIndex] == null); 
		
		//Convert word to asterisk form if word isn't null
		if (word == null) {
			break; 
		} else {
			hiddenWord = asterisk(word);
		}
		
		//Loop while the word is NOT complete
		do {
		
			//Enter a character to guess
			System.out.println("Enter a letter in the word " + hiddenWord + ": ");  
			char letter = input.next().charAt(0);   
			
			//Determine if letter matches, replace current asterisk, and count replacements and correct letters
			for (int i = 0; i < word.length(); i++) {
				if (letter == word.charAt(i)) { 
				hiddenWord.replace(i, i+1, Character.toString(letter)); 
				replacements++; 
				correctLetters++; 
				}
			}	
			
			//Add misses if any replacements were made and if not, print incorrect letter
			if (replacements == 0) {
				misses++; 
				System.out.println(letter + " is not in the word.");
			} 
			
			//Reset replacements
			replacements = 0; 
			
			}  while (correctLetters != word.length());
		
		//Print results and ask to play again
		System.out.println("The word is " + word + "."); 
		System.out.println("You missed " + misses + " times."); 
		System.out.println("Would you like to play again? Enter y or n."); 
		playAgain = input.next().charAt(0); 
		
		//Reset variables and eliminate word from list for next round
		correctLetters = 0; 
		misses = 0; 
		wordList[wordsIndex] = null; 
		nullCount = 0; 

	} while (playAgain != 'n'); 
	
	System.out.println("Thank you for playing!");
	input.close(); 
}

//METHOD: Load words from random list
public static String[] loadWords() {
	String[] words = {"sisko", "odo", "bashir", "nerys", "quark", "worf", "jadzia", "garak", "obrian", "nog" , "rom", "dukat"}; 
	return words; 
}

//METHOD: Set up hidden word with asterisks
public static StringBuilder asterisk(String word) {
	StringBuilder asteriskWord = new StringBuilder(""); 
	for (int i = 0; i < word.length(); i++) {
		asteriskWord.append("*"); 
	}
	return asteriskWord; 
}
}

