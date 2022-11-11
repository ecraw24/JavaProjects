import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		final int ADD = 1; 
		final int DEL = 2; 
		final int PRIORITY = 3;  
		final int SEARCH = 4; 
		final int QUIT = 5; 
		int selection = -1; 
		BehaviorTreeMap map = new BehaviorTreeMap(); 
		Scanner input = new Scanner(System.in);
		
		do {
			userMenu(); 
			selection = input.nextInt(); 
			if (selection < 9 && selection > 0) {
				switch (selection) {
					case ADD: 
						addBehavior(map, createBehavior()); 
						break; 
					case DEL: 
						removeBehavior(map); 
						break; 
					case PRIORITY: 
						viewBehaviorsByPriority(map.getPriorityMap());
						break; 
					case SEARCH:
						print("Enter a target to see if it is in the list: "); 
						String target = input.next(); 
						if (map.search(target)) {
							print("Target found!"); 
						} else {
							print("Target is not in the list."); 
						}
						break; 
					case QUIT: 
						break; 
					default:
						print("Invalid input. Try again."); 
				}
			}

			
			
		} while (selection != QUIT); 
 
	}

	public static void userMenu() {
		System.out.println("BEHAVIOR MENU "); 
		System.out.println("-----------------");
		System.out.println("1. Add a behavior"); 
		System.out.println("2. Remove a behavior");
		System.out.println("3. Sort and view by priority");
		System.out.println("4. Search for a behavior");
		System.out.println("5. Quit program"); 
	}
	
	public static void viewBehaviorsByPriority(TreeMap<Integer, Behavior> map) {
		System.out.println(map.entrySet().toString()); 
	}
	
	public static void viewBehaviorsByTarget(TreeMap<Behavior, String> map) {
		int i = 1; 
		for (Behavior behavior : map.keySet()) {
			System.out.println(i + ". " + map.get(behavior).toString());
			i++; 
		}	
	}
	
	public static void removeBehavior(BehaviorTreeMap map) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which behavior would you like to remove? (type priority number)");
		viewBehaviorsByPriority(map.getPriorityMap()); 
		int del = input.nextInt(); 
		try { 
			Behavior behavior = map.getPriorityMap().remove(del); 
			map.getFunctionMap().remove(behavior); 
		} catch (Exception e) {
			print("Invalid input. Try again."); 
		}	
	}
	
	public static Behavior createBehavior() {
		Scanner input = new Scanner(System.in);
		System.out.println("Which type of behavior would you like to add?"); 
		System.out.println("1. Attention"); 
		System.out.println("2. Escape");
		System.out.println("3. Tangible");
		int selection = input.nextInt(); 
		switch (selection) {
			case 1:
				Attention att = new Attention();
				print("Is the behavior aggressive? (y/n)"); 
				String agg = input.next(); 
				if (agg == "y") {
					((Attention) att).isAggressive = true; 
				}
				addBehaviorAttributes(att);  
				return (Behavior) att; 
			case 2:
				Escape esc = new Escape(); 
				print("Is the behavior indicative of an elopement risk? (y/n)"); 
				String elopement = input.next(); 
				if (elopement == "y") {
					esc.elopementRisk = true; 
				}
				addBehaviorAttributes(esc); 
				return (Behavior) esc; 
			case 3:
				Tangible tang = new Tangible(); 
				print("Is there free access to the item? (y/n)"); 
				String access = input.next(); 
				if (access == "y") {
					tang.freeAccess = true; 
				}
				addBehaviorAttributes(tang); 
				return (Behavior) tang;  
			default: 
				print("Invalid selection. Try again."); 
				return null; 
		}
	}
	
	public static void addBehaviorAttributes(Behavior behavior) {
		Scanner input = new Scanner(System.in); 
		
		print("What is the target (string)?"); 
		String target = input.nextLine(); 
		try {
			behavior.setTarget(target);
		} catch (Exception e) {
			System.out.println("Invalid selection. Try again."); 
		}
		
		print("What is the frequency (integer)?"); 
		int freq = input.nextInt(); 
		try {
			behavior.setFrequency(freq);
		} catch (Exception e) {
			System.out.println("Invalid selection. Try again."); 
		}
		
		print("What is the severity (integer)?"); 
		int severity = input.nextInt(); 
		try {
			behavior.setSeverity(severity); 
		} catch (Exception e) {
			System.out.println("Invalid selection. Try again."); 
		}
	}
	
	public static void addBehavior(BehaviorTreeMap map, Behavior behavior) {
		map.getPriorityMap().put((behavior.frequency + behavior.severity), behavior); 
		//map.getFunctionMap().put(behavior, behavior.getTarget()); 
	}
	
	public static void print(String string) {
		System.out.println(string); 
	}
}
