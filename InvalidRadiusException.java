
public class InvalidRadiusException extends Exception {
	private double radius;
	
	public InvalidRadiusException() {
		super("Invalid radius");
	}
	
	public InvalidRadiusException(double r) {
		super("Invalid radius: " + r);
		this.radius = r;
	}
}
