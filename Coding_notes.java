import java.util.Scanner;
// Google Oracle help center for imports 
//java.util.* (implicit import/every item in package)

public class Coding_notes {

	public static void main(String[] args) {
	//declare identifier, data type double (8 bytes with address) can hold decimal
	//variables can be letters, numbers, or underscores (can't start with a #)
	//no reserve words (purple words), true/false/null, static, etc.
	//int = whole #; double = decimal; char = single character in single quotes
		
		double radius;
		double area;
		final double PI = 3.14159;
		// final type (variable in all caps) = [constant]	

		System.out.println("Please enter a circle radius: ");
		Scanner input = new Scanner(System.in);
		
		radius = input.nextDouble();
		++radius; 
		radius++; 
		
		// keep in mind difference between ++radius and radius++; timing matters 
		
		//nextDouble() is a Scanner method
		area = 3.14159 * radius * radius;
		
		System.out.println("The area of the circle with radius " + radius + " = " + area);
		//system.out is the monitor; system.in is the keyboard/user
		
		input.close(); 
		//to prevent "resource leak"; mostly a good habit to free up object and memory
	}

}
// data type can be byte to borrow 8-bit < "short" = 2 bytes < int = 2 < short = 2 int < long = 2 short < float < double
