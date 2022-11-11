import java.util.*;

public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<String>(Collections.reverseOrder());
		queue1.offer("banana");
		queue1.offer("apple");
		queue1.offer("orange");
		queue1.offer("avocado");
		
		while (queue1.isEmpty() == false) {
			System.out.print(queue1.remove() + " ");
		}

	}

}
