import java.util.Scanner;

public class Quotient {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		/*if (num2 != 0) {
			int quotient = num1 / num2;
			System.out.println("Dividing " + num1 + " by " + num2 + " gives " + quotient);
		} else {
			System.out.println("Divisor cannot be zero!");	
		}*/
		
		System.out.println("Dividing " + num1 + " by " + num2 + " gives " + quotient(num1, num2));
		
		System.out.println("Goodbye");
		input.close();
	}

	public static int quotient(int num, int den) {
		if (den == 0) {
			System.out.println("Divisor cannot be zero!");
			System.exit(1);
		} 
			
		return (num / den);
	}
}
