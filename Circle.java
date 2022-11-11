
public class Circle {
	private double radius;
	private static int numberOfCircles;
	
	public static final double PI = Math.PI;
	
	// Default constructor
	public Circle() {
		this.radius = 0.0;
		numberOfCircles++;
	}

	// Initializing constructor
	public Circle(double r) {
		setRadius(r);
		numberOfCircles++;
	}
	
	public void setRadius(double r) {
		this.radius = (r > 0) ? r : 0;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double calculateArea() {
		return PI * this.radius * this.radius;
	}
	
	public double calculatePerimeter() {
		return 2 * Math.PI *this. radius;
	}
	
	//public void printCircle() {
	//	System.out.printf("Radius: %.2f\nArea: %.2f\nPerimeter: %.2f\n", radius, calculateArea(), calculatePerimeter());
	//}
	
	public String toString() {
		return String.format("Radius: %.2f\nArea: %.2f\nPerimeter: %.2f\n", this.radius, calculateArea(), calculatePerimeter());
	}
	
	public static int getNumberOfCircles() {
		return numberOfCircles;
	}
}
