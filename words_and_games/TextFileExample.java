import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileExample {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner input = new Scanner(System.in);
		Scanner input = new Scanner(new FileReader("wages.txt"));
		PrintWriter outFile = new PrintWriter("final_wages.txt");
		
		//System.out.println("Enter firstname, lastname, hours worked, and payrate: ");
		System.out.println("Processing....");
		
		while (input.hasNext()) {
			String firstName = input.next();
			String lastName = input.next();
			double hoursWorked = input.nextDouble();
			double payRate = input.nextDouble();
			
			double wages = hoursWorked * payRate;
			System.out.printf("%s %s: Earned $%.2f\n", firstName, lastName, wages);
			outFile.printf("%s %s: Earned $%.2f\n", firstName, lastName, wages);
		}
		
		input.close();
		outFile.close();
	}

}
