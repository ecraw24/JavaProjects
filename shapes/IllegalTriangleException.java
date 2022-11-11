// Emma Crawford
// Program 9: Exception Class
// 4/26/2021

public class IllegalTriangleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalTriangleException(double s1, double s2, double s3) {
		super("The sum of any two sides is less than the other side."); 
		System.out.println("Side 1: " + s1 + ", Side 2: " + s2 + ", Side 3: " + s3); 
	}
}