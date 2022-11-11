
public class CastingDemo {

	public static void main(String[] args) {
		Circle c = new Circle(5.9, "red", false);
		Triangle t = new Triangle();
		
		displayObject(c);
		System.out.println();
		displayObject(t);

		Circle c2 = new Circle(5.9, "red", true);
		
		if (c.equals(c2)) {
			System.out.println("\nThe two circles are equal!");
		}

	}

	public static void displayObject(GeometricObject obj) {
		System.out.println("Created on " + obj.getDateCreated() + ". Color is " + obj.getColor());
		
		//System.out.println("Area = " + ((Circle)obj).getArea());
		
		if (obj instanceof Circle) {
			System.out.println("Area = " + ((Circle)obj).getArea());
		} else if (obj instanceof Triangle) {
			System.out.println("Area = " + ((Triangle)obj).getArea());
		}
	}

}
