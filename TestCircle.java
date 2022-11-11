import java.util.Date;
import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today.toString());
		
		Scanner input = new Scanner(System.in);
		double rad = 0.0;
		
		System.out.println("Enter a radius: ");
		rad = input.nextDouble();
		
		Circle cir = new Circle();
		cir.setRadius(rad);
		System.out.println("radius = " + cir.getRadius());
		
		//double area = cir.calculateArea();
		//double perimeter = cir.calculatePerimeter();
		//System.out.printf("The area is %.2f, the perimeter is %.2f\n", area, perimeter);
		//cir.printCircle();
		
		//System.out.println(cir.getStringCircle());
		
		System.out.println(cir);
		
		Circle cir2 = new Circle(10.5);
		//cir2.setRadius(10.5);
		//cir2.printCircle();
		
		
		//double area = Math.PI * radius * radius;
		//System.out.printf("The area is %.2f", area);
		
		input.close();
	}

}
