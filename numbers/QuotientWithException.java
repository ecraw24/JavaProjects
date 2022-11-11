import java.util.InputMismatchException;
import java.util.Scanner;

public class QuotientWithException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		try {
			//int quotient = num1 / num2;
			System.out.println("Dividing " + num1 + " by " + num2 + " gives " + quotient(num1, num2));
		} /*catch(ArithmeticException ex) {
			System.out.println("Exception thrown, cannot divide by zero!");
		} catch(InputMismatchException ex) {
			System.out.println("Input mismatch, cannot divide by zero!");
		}*/ catch(RuntimeException ex) {
			System.out.println("Exception throw: " + ex.getMessage());
		}
		
		System.out.println("Goodbye");
		input.close();
	}

	public static int quotient(int num, int den) throws ArithmeticException, InputMismatchException  {
		if (den == 0) {
			//System.out.println("Divisor cannot be zero!");
			//throw new ArithmeticException("Divisor cannot be zero!");
			throw new InputMismatchException("Divisor cannot be zero!");
		//	System.exit(1);
		} 

		return (num / den);
	}
}
