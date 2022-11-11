import java.util.*;

public class CountKeywords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();
		
		System.out.println("Java keywords in " + sentence + " = " + countKeywords(sentence));
		
		input.close();
	}
	
	public static int countKeywords(String str) {
		String[] keywords = {"abstract", "void", "break", "public"};
		
		Set<String> keywordSet = new HashSet<>(Arrays.asList(keywords));
		int count = 0;
		
		String[] parts = str.split(" ");
		for (String s : parts) {
			if (keywordSet.contains(s)) {
				count++;
			}
		}
		
		return count;
	}

}
