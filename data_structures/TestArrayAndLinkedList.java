import java.util.*;

public class TestArrayAndLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(0, 10);
		arrayList.add(3, 30);
		System.out.println(arrayList);
		
		LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
		System.out.println(linkedList);
		linkedList.add(1, "red");
		linkedList.removeLast();
		linkedList.addFirst("green");
		System.out.println(linkedList);
		
		ListIterator<Object> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();
		
		listIterator = linkedList.listIterator(linkedList.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
	}

}
