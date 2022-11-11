import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Smith", 30);
		hashMap.put("Anderson", 34);
		hashMap.put("Lewis", 29);
		hashMap.put("Cook", 29);
		
		System.out.println(hashMap);
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Smith", 30);
		linkedHashMap.put("Anderson", 34);
		linkedHashMap.put("Lewis", 29);
		linkedHashMap.put("Cook", 29);
		System.out.println(linkedHashMap);
		
		System.out.println("Anderson age = " + linkedHashMap.get("Anderson"));
		System.out.println(linkedHashMap);
		
		Map<String, Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println(treeMap);
		
		System.out.println(treeMap.keySet());
		System.out.println(treeMap.entrySet());
	}

}
