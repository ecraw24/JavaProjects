import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		//ask the user for how much money they spent
		
		Scanner input = new Scanner(System.in); 
		final double SALES_TAX = 0.06; 
		
		System.out.println("Enter your purchase amount: "); 
		double amount = input.nextDouble(); 
		double tax = amount * SALES_TAX; 
		double total = amount + tax; 
		
		System.out.println("Your sales tax is: $" + (tax * 100) / 100.0); 
		System.out.println("Your total is: $" + total); 

		

	}

}
