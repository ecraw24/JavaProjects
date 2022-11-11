//Convert phone number with numbers and/or letters to numerical form
//Emma Crawford
//Programming Assignment 5
// 03/23/2021

import java.util.Scanner;

public class PhoneNumberConverter {

	public static void main(String[] args) {
		
		//Import scanner and set phone and numeric phone variables
		Scanner input = new Scanner(System.in);  
		String phoneNumber = ""; 
		String numericPhone = ""; 
		
		//Loop through the error message until the user types a valid entry
		do {
		System.out.println("Enter a phone number string: ");
		phoneNumber = input.nextLine(); 
		
		//Determine if # is valid (11 digits)
		if(isValidPhoneNumber(phoneNumber)) {
			numericPhone = translateNumber(phoneNumber);  
		} else {
			System.out.print("Invalid entry. "); 
		}
		} while (!isValidPhoneNumber(phoneNumber)); 
		
		//Components of dashed phone # (extra credit)
		String areaCode = numericPhone.substring(1,4); 
		String threeDig = numericPhone.substring(4,7); 
		String fourDig = numericPhone.substring(7,11); 
		
		//Print final phone number (with dashes)
		System.out.println(phoneNumber + " is translated to 1" + "-" + areaCode + "-" + threeDig + "-" + fourDig); 
		
		//Close input resource
		input.close();
	}

//METHOD: determine if the string is a valid phone number	
public static boolean isValidPhoneNumber(String phoneNumber) {
	
	int count = 0;
	boolean valid = false;  
	
	//Scan through number and determine if a char is a number or letter, and count
	for (int i = 0; i < phoneNumber.length(); i++) {
	    if (Character.isDigit(phoneNumber.charAt(i)) || Character.isLetter(phoneNumber.charAt(i))) {
	        count++;
	    }
	}
	
	//Use boolean variable if 11 characters (minus dashes)
	if (count == 11) {
		valid = true; 
	}
	
	return valid; 
}

//METHOD: translate number into numeric form 
public static String translateNumber(String phoneNumber) {
	
	//Set formatted number variables and add if digit or translate if letter
	String formattedNumber = ""; 
	for (int i = 0; i < phoneNumber.length(); i++) {
	    if (Character.isDigit(phoneNumber.charAt(i))) {
	        formattedNumber += phoneNumber.charAt(i); 
	    } else if (Character.isLetter(phoneNumber.charAt(i))) {
	    	int number = getNumber(phoneNumber.charAt(i)); 
	    	formattedNumber += number; 
	    }      
	}
	return formattedNumber; 
}

//METHOD: translate letter into numeric form based on international letter mapping 
public static int getNumber(char letter) {
	
	int number = 0; 
	
	//International standard letter mapping
	switch (letter) { 

		case 'a', 'b', 'c':
			number = 2; break; 
		case 'd', 'e', 'f':
			number = 3; break;
		case 'g', 'h', 'i':
			number = 4; break;
		case 'j', 'k', 'l':
			number = 5; break;
		case 'm', 'n', 'o':
			number = 6; break;
		case 'p', 'q', 'r', 's':
			number = 7; break;
		case 't', 'u', 'v':
			number = 8; break;
		case 'w', 'x', 'y', 'z': 
			number = 9; break;
 
	}
	
	return number; 
}
}