import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Circle c = new Circle(5.9, "red", true);
		Triangle t = new Triangle();
		
		displayObject(c);
		System.out.println();
		displayObject(t);

		ArrayList<GeometricObject> shapeList = new ArrayList<>();
		shapeList.add(c);
		shapeList.add(t);
		shapeList.add(new Circle());
		
		System.out.println();
		for (int i = 0; i < shapeList.size(); i++) {
			System.out.println(shapeList.get(i).getArea());
		}
		
		GeometricObject[] shapes = new GeometricObject[4];
		shapes[0] = c;
		shapes[1] = t;
		shapes[2] = new Circle(6.7, "blue", false);
		shapes[3] = new Triangle(3, 4, 5);
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		System.out.println();
		
		Arrays.sort(shapes);
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].getArea());
		}
	}

	public static void displayObject(GeometricObject obj) {
		System.out.println("Created on " + obj.getDateCreated() + ". Color is " + obj.getColor());
		System.out.println("Area = " + obj.getArea());
	}
}
