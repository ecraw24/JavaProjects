import java.util.HashMap;
import java.util.TreeMap;

public class BehaviorTreeMap {
	
	private static TreeMap<Integer,Behavior> priorityMap = new TreeMap<Integer,Behavior>(); 
	private static TreeMap<Behavior, String> functionMap = new TreeMap<Behavior,String>(); 
	
	public static boolean search(int key) {
		if (priorityMap.containsKey(key)) {
			return true; 
		} else {
			return false; 
		}	
	}
	
	public static boolean search(Behavior behavior) {
		if (priorityMap.containsValue(behavior)) {
			return true; 
		} else if (functionMap.containsKey(behavior)){
			return true; 
		} else {
			return false; 
		}
	}
	
	public boolean search(String string) {
		String[] targets = new String[priorityMap.size()]; 
		for(Behavior behavior : priorityMap.values()) {
			for (int i = 0; i < priorityMap.size(); i++) {
				targets[i] = behavior.toString(); 
			}
		}

		for (String str : targets) {
			if (str.equals(string)) {
				return true;
			} 
		}
		return false; 
	}
	
	public static String returnAllWith(int priority) {
		HashMap<Integer, Behavior> intList = new HashMap<Integer,Behavior>(); 
		for (int i: priorityMap.keySet()) {
			if (i == priority) {
				intList.put(i, priorityMap.get(i)); 
			}
		}
		return intList.toString(); 
	}
	
	public static void sortBy(String string) {
		if (string.equals("priority")) {
			print(priorityMap); 
		} else if (string.equals("behavior")) {
			print(functionMap); 
		} else if (string.equals("function")) {
			TreeMap<String, Behavior> byFunction = new TreeMap<String,Behavior>(); 
			for(String str: functionMap.values()) {
				for(Behavior bx: functionMap.keySet()) {
					byFunction.put(str, bx); 
				}
			}
			print(byFunction); 
		}
	}
	
	public static <K,V> void print(TreeMap<K,V> map) {
		System.out.println(map.entrySet()); 
	}

	public TreeMap<Integer, Behavior> getPriorityMap() {
		return priorityMap;
	}

	public static void setPriorityMap(TreeMap<Integer, Behavior> priorityMap) {
		BehaviorTreeMap.priorityMap = priorityMap;
	}

	public TreeMap<Behavior, String> getFunctionMap() {
		return functionMap;
	}

	public static void setFunctionMap(TreeMap<Behavior, String> functionMap) {
		BehaviorTreeMap.functionMap = functionMap;
	}

}
