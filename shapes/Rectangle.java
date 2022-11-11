public class Rectangle {
	private double width;
	private double length; 

	//default
	public Rectangle() {
		this.width = 1;
		this.length = 1; 
	}
	
	//set width and length
	public Rectangle(double w, double l) {
		this.width = (w > 0) ? w : 1;
		this.length = (l > 0) ? l : 1;
	}
	
	//get width
	public double getWidth() {
		return this.width;
	}
	
	//get length
	public double getLength() {
		return this.length;
	}
	
	//get area
	public double getArea() {
		return (this.width * this.length);
	}
	
	//get perimeter
	public double getPerimeter() {
		return (2*(this.width + this.length));
	}


}