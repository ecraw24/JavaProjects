import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println(set);
		
		for (String s : set) {
			System.out.print(s.toUpperCase() + " ");
		}
		
		set.add("Buffalo");
		set.add("Rochester");
		
		System.out.println();
		set.forEach(e -> System.out.print(e.toLowerCase() + " "));
		
		System.out.println();
		System.out.println("set size = " + set.size());
		
		set.remove("Rochester");
		set.forEach(e -> System.out.print(e.toLowerCase() + " "));
		
		HashSet<String> set2 = new HashSet<String>();
		set2.add("London");
		set2.add("Shanghai");
		set2.add("Paris");
		
		System.out.println("\nIs Taipei in set2? " + set2.contains("Taipei"));
		
		set.addAll(set2);
		System.out.println(set);
		set.retainAll(set2);
		System.out.println(set);
	}

}
