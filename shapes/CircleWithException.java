
public class CircleWithException {
	private double radius;
	
	public CircleWithException() throws InvalidRadiusException {
		this(1.0);
	}
	
	public CircleWithException(double newRadius) throws InvalidRadiusException {
		setRadius(newRadius);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double newRadius) throws InvalidRadiusException {
		if (newRadius >= 0.0) {
			this.radius = newRadius;
		} else {
			//throw new IllegalArgumentException("Radius cannot be negative");
			throw new InvalidRadiusException(newRadius);
		}
		//this.radius = (newRadius >= 0.0) ? newRadius : 0.0;
	}
	
	public double calcArea() {
		return this.radius * this.radius * 3.14159;
	}
}
