import java.util.ArrayList;
import java.util.Collections;

public class GenericStack<T extends Comparable<T>> {
	
	private ArrayList<T> list = new ArrayList<>();
	
	public int getSize() {
		return list.size();
	}
	
	public T peek() {
		return list.get(getSize() - 1);
	}
	
	public void push(T t) {
		list.add(t);
	}
	
	public T pop() {
		T t = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return t;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
