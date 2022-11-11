import java.util.Arrays;
import java.util.Scanner;

public class QuadTest {

	public static void main(String[] args) {
	
		//Set Level and create corresponding grid
		int level = 1; 
		int rowSize = (level+1)*2; 
		int colSize = (level+1)*2; 
		int[][] grid = new int[rowSize][colSize];  
		int row = 0; 
		int col = 0; 
		
		// Grid color counts
		int redCount = 0; 
		int blueCount = 0; 
		int greenCount = 0; 
		int yellowCount = 0; 
		int fourth = rowSize*colSize/4; 

		//Iterate through colors to generate grid (1/4 for each color)
		while (row < rowSize) {
			while (col < colSize) {
				int random = (int) (Math.random()*4); 
				if        (random == 0 && redCount    == fourth) {
					continue; 
				} else if (random == 1 && blueCount   == fourth) {
					continue; 
				} else if (random == 2 && greenCount  == fourth) {
					continue; 
				} else if (random == 3 && yellowCount == fourth) {
					continue; 
				} else {
					grid[row][col] = random;  
					switch (random) {
					case 0:
						redCount++; break; 
					case 1:
						blueCount++; break; 
					case 2:
						greenCount++; break; 
					case 3: 
						yellowCount++; break; 
					}
				}
			col++;
			} 
			col = 0; 
			row++; 
		}
		
		//Print grid
				for (int i = 0; i < rowSize; i++) {		
						System.out.println(Arrays.toString(grid[i]));
				}
		
		//Get user input
		Scanner input = new Scanner(System.in); 
		System.out.println("Which cell would you like to target? Type in row #, press enter, type in col #, press enter. Type -1 to quit.");
		int userRow = input.nextInt();
		int SENTINAL = -1; 
		
		// Get cell parameters and flip option
		while (userRow != SENTINAL) {
		int userCol = input.nextInt(); 
		System.out.println("How would you like to flip the grid? H for horizontal, V for vertical, D for Downslope, U for Upslope."); 
		String flip = input.next(); 
				
		//Set variables for flipping 
		int maxIndex = rowSize-1;  
		int userTemp = grid[userRow][userCol]; 
		int partnerTemp; 

		//Swap locations
		switch (flip) {
		case "H": 
			partnerTemp = grid[maxIndex-(userRow)][userCol]; 
			grid[maxIndex-(userRow)][userCol] = userTemp; 
			grid[userRow][userCol] = partnerTemp; 
			break; 
		case "V":
			partnerTemp = grid[userRow][maxIndex-(userCol)]; 
			grid[userRow][maxIndex-(userCol)] = userTemp; 
			grid[userRow][userCol] = partnerTemp; 
			break; 
		case "D": 
			partnerTemp = grid[userCol][userRow];
			grid[userCol][userRow] = userTemp; 
			grid[userRow][userCol] = partnerTemp; 
			break; 
		case "U": 
			partnerTemp = grid[maxIndex-userRow][maxIndex-userCol];
			grid[maxIndex-userRow][maxIndex-userCol] = userTemp; 
			grid[userRow][userCol] = partnerTemp; 
			break; 
		}	
		
		//Print grid
		for (int x = 0; x < rowSize; x++) {		
				System.out.println(Arrays.toString(grid[x]));
		}		
		
		
		// CHECK FOR WIN
		int quadA = grid[0][0]; 
		int quadB = grid[0][maxIndex]; 
		int quadC = grid[maxIndex][0];  
		int r = 0; 
		int c = 0; 
		boolean A = false; 
		boolean B = false; 
		boolean C = false; 

		//quadA check
		while (c <= ((colSize/2) - 1)) {
			while (r <= ((rowSize/2) - 1)) {
				if (grid[r][c] == quadA) {
					r++;  
					A = true; 
				} else { 
					A = false; 
					r = rowSize*4;
					c = colSize*4; 
				}
			}
			c++; 
		}

		//quadB check
		r = 0; 
		c = ((colSize/2) +1); 
		while (c <= (colSize-1)) {
			while (r <= (rowSize/2) - 1) {
				if (grid[r][c] == quadB) {
					r++; 
					B = true; 
				} else {
					B = false; 
					r = rowSize*4;
					c = colSize*4; 
				} 
			}
			c++; 
		}

		//quadC check
		c=0; 
		r = ((rowSize/2)+1); 
		while (c <= ((colSize/2) - 1)) {
			while (r <= (rowSize-1)) {
				if (grid[r][c] == quadC) {
					r++; 
					C = true; 
				} else {
					C = false; 
					r = rowSize*4;
					c = colSize*4;  
				}
			}
			c++; 
		}
		
		if (A && B && C) {
			level++; 
			System.out.println("You win! The next level is " + level + "."); 
			System.out.println("Which cell would you like to target? Type in row #, press enter, type in col #, press enter. Type -1 to quit.");
			userRow = input.nextInt();
		} else {	
		System.out.println("Which cell would you like to target? Type in row #, press enter, type in col #, press enter. Type -1 to quit.");
		userRow = input.nextInt();
		}
		}
		input.close(); 
	}
}




