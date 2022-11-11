import java.util.*;

public class TestTreeSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println("Unsorted HashSet: " + set);
		
		TreeSet<String> treeSet = new TreeSet<String>(set);
		System.out.println("Sorted TreeSet: " + treeSet);
		
		System.out.println("first(): " + treeSet.first());
		System.out.println("last(): " + treeSet.last());
		System.out.println("headSet(): " + treeSet.headSet("New York"));
		System.out.println("tailSet(): " + treeSet.tailSet("New York"));
		
		System.out.println("lower(): " + treeSet.lower("P"));
		System.out.println("higher(): " + treeSet.higher("P"));
		
		System.out.println();
		System.out.println("Sorted TreeSet: " + treeSet);
		System.out.println("pollFirst(): " + treeSet.pollFirst());
		System.out.println(treeSet);
		System.out.println("pollLast(): " + treeSet.pollLast());
		System.out.println(treeSet);
	}

}
