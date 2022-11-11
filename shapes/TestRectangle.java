
public class TestRectangle {

	public static void main(String[] args) {
		
		//Rectangle 1
		double w1 = 4; 
		double l1 = 40; 
		Rectangle rec1 = new Rectangle(w1,l1);
		System.out.println("Rectangle 1: "); 
		System.out.printf("The width is %.2f and the length is %.2f\n",rec1.getWidth(), rec1.getLength()); 
		System.out.printf("The area is %.2f and the perimeter is %.2f\n",rec1.getArea(), rec1.getPerimeter());
		System.out.println(); 
		
		//Rectangle 2
		double w2 = 3; 
		double l2 = 35.9; 
		Rectangle rec2 = new Rectangle(w2,l2);
		System.out.println("Rectangle 2: "); 
		System.out.printf("The width is %.2f and the length is %.2f\n", rec2.getWidth(), rec2.getLength());
		System.out.printf("The area is %.2f and the perimeter is %.2f\n",rec2.getArea(), rec2.getPerimeter());

	}

}
