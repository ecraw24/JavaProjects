//Emma Crawford
//Test Account Class
//April 13, 2021

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
	
		//Number of account IDs and create account array
		int accountIDs = 10; 
		Account[] accountBalances = new Account[accountIDs];
		
		//Create account for each location in array
		for (int i = 0; i < accountIDs; i++) {
			accountBalances[i] = new Account(); 
			accountBalances[i].AccountInfo(i, 100); 
		}
		
		//Set up scanner
		Scanner input = new Scanner(System.in); 

		//Set selection, exit, and new session variables
		int selection = 0; 
		final int EXIT = 4; 
		final int NEW = 5; 

		do {
			
			//Get account ID
			System.out.println("Enter your account ID (0 to 9): "); 
			int ID = input.nextInt();
			
			do {
			
				//Validate account ID between 0 and 9
				if (ID < 0 || ID > 9) {
					System.out.println("Invalid entry"); 
					break; 
				}	
			
				//Account menu
				System.out.println("1. Show balance");
				System.out.println("2. Deposit funds");
				System.out.println("3. Withdraw funds");
				System.out.println("4. Exit");
				System.out.println("5. View another account"); 
				System.out.println("Enter choice: "); 
				selection = input.nextInt();
				
				//Switch statements based on user selection
				switch (selection) {
					
					case 1: //show balance, monthly interest, and date
						System.out.printf("Balance: $%.2f\n", accountBalances[ID].getBalance()); 
						System.out.printf("Monthly interest: $%.2f\n", accountBalances[ID].getMonthlyInterest());
						System.out.println("Date created: " + accountBalances[ID].dateCreated());
						System.out.println(); 
						break; 
					case 2: //deposit amount and show new balance
						System.out.printf("Current balance: $%.2f\n", accountBalances[ID].getBalance());		
						System.out.println("Enter amount to deposit: "); 
						double deposit = input.nextDouble(); 
						accountBalances[ID].deposit(deposit); 
						System.out.printf("You deposited: $%.2f\n", deposit); 
						System.out.printf("Balance after deposit: $%.2f\n", accountBalances[ID].getBalance());	
						System.out.println(); 
						break; 
					case 3: //withdraw amount and show new balance
						System.out.printf("Current balance: $%.2f\n", accountBalances[ID].getBalance());		
						System.out.println("Enter amount to withdraw: "); 
						double withdraw = input.nextDouble(); 
						
						//Ensure sufficient funds
						if (accountBalances[ID].getBalance()>= withdraw) { 
							accountBalances[ID].withdraw(withdraw); 
							System.out.printf("Withdrawal amount: $%.2f\n", withdraw); 
							System.out.printf("Current balance after withdrawal: $%.2f\n", accountBalances[ID].getBalance());
							System.out.println(); 
						} else {
							System.out.println("You have insufficient funds for this withdrawal."); 
							System.out.println(); 
						}
						break; 	
				}
				
			//while user does not want to enter a different ID
			} while (selection != NEW && selection != EXIT); 
			
		//while user does not want to exit
		} while (selection != EXIT); 
		
		//End menu and close resource
		System.out.println("$$ Have a nice day! $$"); 
		System.out.println(); 
		input.close();
	}
}
