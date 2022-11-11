
public class TestCircleWithException {

	public static void main(String[] args) {
		try {
			//CircleWithException c1 = new CircleWithException(5.0);
			//System.out.printf("Area = %.2f\n", c1.calcArea());
	
			//CircleWithException c2 = new CircleWithException(-5.0);
			//System.out.printf("Area = %.2f\n", c2.calcArea());
			createCircles();
		} catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException again: " + e.getMessage());
		} catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
			//e.printStackTrace();
		} finally {
			System.out.println("cleanup!");
		}
	}

	public static void createCircles() throws Exception {
		try {
			CircleWithException c1 = new CircleWithException(5.0);
			System.out.printf("Area = %.2f\n", c1.calcArea());
	
			CircleWithException c2 = new CircleWithException(-5.0);
			System.out.printf("Area = %.2f\n", c2.calcArea());
		} catch(InvalidRadiusException e) {
			System.out.println("InvalidRadiusException: " + e.getMessage());
			//throw e;
			throw new Exception("Bad radius", e);
		}
	}
}
