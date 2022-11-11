public class Triangle extends GeometricObject implements Colorable {
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

	public Triangle() {
	  
	}

	public Triangle(double side1, double side2, double side3) {
	    this.side1 = side1;
	    this.side2 = side2;
	    this.side3 = side3;
	}
	  
	public double getSide1() {
	    return this.side1;
	}

	public double getSide2() {
	    return this.side2;
	}
	  
	public double getSide3() {
	    return this.side3;
	}
	  
	@Override
	public double getArea() {
	    double s = (this.side1 + this.side2 + this.side3) / 2;
	    return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}

	public double getPerimeter() {
	    return this.side1 + this.side2 + this.side3;
	}

	@Override 
	public String toString() {
	    return super.toString() + 
	      "\nTriangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all three sides");
	}
}
