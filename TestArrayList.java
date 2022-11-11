import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();
		
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Tokyo");
		
		System.out.println("List size = " + cityList.size());
		
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		System.out.println("Index of Denver = " + cityList.indexOf("Denver"));
		
		for (int i = 0; i < cityList.size(); i++) {
			System.out.println(cityList.get(i).toUpperCase());
		}
		
		System.out.println();
		
		String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
		Arrays.sort(cities);
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i].toUpperCase());
		}
		
		cityList.remove("Paris");
		System.out.println("List size = " + cityList.size());
	}

}
