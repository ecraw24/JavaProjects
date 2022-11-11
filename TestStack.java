
public class TestStack {

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();
		System.out.println("stack is empty: " + stack.empty());
		
		final int SIZE = 20;
		for (int i = 0; i < SIZE; i++) {
			stack.push(i);
		}

		while (!stack.empty()) {
			System.out.print(stack.pop() + " " );
		}
	}

}
