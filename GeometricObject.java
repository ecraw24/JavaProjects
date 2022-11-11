import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	// Default constructor.
	public GeometricObject() {
		this.dateCreated = new Date();
	}
	
	// Inititalizing constructor.
	public GeometricObject(String c, boolean f) {
		this.color = c;
		this.filled = f;
		this.dateCreated = new Date();
	}
	
	// Getters and setters for private attributes.
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	
	public boolean isFilled() {
		return this.filled;
	}
	
	public void setFilled(boolean f) {
		this.filled = f;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	public String toString() {
		return "Created on " + this.dateCreated + "\nColor: " + this.color + " and filled: " + this.filled;
	}
	
	public abstract double getArea();
	
	@Override
	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
}
