import java.util.*;

public class SetListPerformanceTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		
		Collection<Integer> set1 = new HashSet<>(list);
		System.out.println("HashSet: " + getTestTime(set1));
		
		Collection<Integer> set2 = new LinkedHashSet<>(list);
		System.out.println("LinkedHashSet: " + getTestTime(set2));
		
		Collection<Integer> set3 = new TreeSet<>(list);
		System.out.println("TreeSet: " + getTestTime(set3));
		
		Collection<Integer> list1 = new ArrayList<>(list);
		System.out.println("ArrayList: " + getTestTime(list1));
		
		Collection<Integer> list2 = new LinkedList<>(list);
		System.out.println("LinkedList: " + getTestTime(list2));
	}

	public static long getTestTime(Collection<Integer> c) {
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			c.contains((int)(Math.random() * 2 * 1000));
		}
		
		return System.currentTimeMillis() - startTime;
	}
}
