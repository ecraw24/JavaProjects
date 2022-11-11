import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

	public static void main(String[] args)  {
		try {
			Scanner fileInput = new Scanner(new FileInputStream("test.txt"));
		} catch(FileNotFoundException ex) {
			System.out.println("could not find your input file ");
		}
		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;
		
		do {
			try {
				System.out.print("Enter an integer: ");
				int num = input.nextInt();
			
				System.out.println("You entered: " + num);
				continueLoop = false;
			} catch(InputMismatchException ex) {
				System.out.println("I asked for an integer! Please try again.");
				input.nextLine();
			}
		} while (continueLoop);

		System.out.println("Thank you, goodbye");
		input.close();
	}

}
