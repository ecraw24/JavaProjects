
public class TestGenericStack {

	public static void main(String[] args) {
		GenericStack<String> s1 = new GenericStack<String>();
		s1.push("hello");
		s1.push("goodbye");
		s1.push("cookie");
		s1.push("dessert");

		System.out.println(s1);
		while (s1.isEmpty() == false) {
			System.out.println(s1.pop());
		}
		System.out.println(s1);
		
		System.out.println();
		
		GenericStack<Circle> s2 = new GenericStack<Circle>();
		s2.push(new Circle(5.0));
		s2.push(new Circle(1.5));
		s2.push(new Circle(25.0));
		s2.push(new Circle(0.0));
		
		System.out.println(s2);
		s2.sort();
		System.out.println(s2);
		while (s2.isEmpty() == false) {
			System.out.println(s2.pop());
		}
		System.out.println(s2);
		
		System.out.println();
		
		String[] words = {"hi", "bye", "pumpkin", "Easter"};
		Circle[] circles = new Circle[3];
		circles[0] = new Circle(0.0);
		circles[1] = new Circle(10.0);
		circles[2] = new Circle(26.0);
		print(words);
		print(circles);
	}

	public static <T> void print(T[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	
}
