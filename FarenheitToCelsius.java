import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter a degree in Farenheit: ");
		int fahren = input.nextInt(); 
		
		//Conversion: (5/9 * (f - 32))
		
		double celsius = (5.0 / 9.0) * (fahren - 32); 
		// numbers must have a decimal; otherwise it is integer division
		
		System.out.println( " Fahrenheit " + fahren + " is " + celsius + " in Celsius");
		

	}

}
