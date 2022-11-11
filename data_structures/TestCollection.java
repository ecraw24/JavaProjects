import java.util.*;

public class TestCollection {

	public static void main(String[] args) {
		ArrayList<String> collection1 = new ArrayList<String>();

		collection1.add("New York");
		collection1.add("Atlanta");
		collection1.add("Dallas");
		collection1.add("Madison");
		System.out.println(collection1);
		
		System.out.println("\nIs Dallas in the list? " + collection1.contains("Dallas"));
		collection1.remove("Dallas");
		System.out.println(collection1);
		
		ArrayList<String> collection2 = new ArrayList<String>();

		collection2.add("Seattle");
		collection2.add("Portland");
		collection2.add("Los Angeles");
		collection2.add("Atlanta");
		System.out.println(collection2);
		
		ArrayList<String> clone1 = (ArrayList<String>)(collection1.clone());
		System.out.println(clone1);
		clone1.addAll(collection2);
		System.out.println(clone1);
		clone1.removeAll(collection2);
		System.out.println(clone1);
		
		for (String city : collection1) {
			System.out.println(city);
		}
		
		for (int i = 0; i < collection1.size(); i++) {
			System.out.println(collection1.get(i));
		}
		
		Iterator<String> iter = collection1.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().toUpperCase() + " " );
		}
		
		
	}

}
