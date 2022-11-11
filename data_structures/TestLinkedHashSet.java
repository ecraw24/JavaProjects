import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		System.out.println(set);
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>(set);
		System.out.println(set2);

	}

}
