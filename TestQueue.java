import java.util.*;

public class TestQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Alaska");
		queue.offer("Indiana");
		queue.offer("Texas");
		
		while (queue.isEmpty() == false) {
			System.out.print(queue.remove() + " ");
		}
	}

}
