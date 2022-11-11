//Emma Crawford, Travis Roberts
//Lab 8
//Count integers 1-9 in 100 integers
//3/23/2021

public class CountOf100Ints {

	public static void main(String[] args) {
	
	//Set up counting array 
	int[] reference = new int[10];  
	
	//Generate random numbers and add to reference array
	for (int count = 0; count < 100; count++) {
		int number = (int) (Math.random()*10); 
		reference[number] += 1; 
		}
	
	//Print counts
	for (int i = 0; i < reference.length; i++) {
		System.out.println("Count for " + i + " is " + reference[i] + ".");
	}
	}
}
