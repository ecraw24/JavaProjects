
public class ShowCurrentTime {

	public static void main(String[] args) {
		// Get the current time in milliseconds since Jan 1, 1970
		
		long totalMillis = System.currentTimeMillis(); 
		
		double totalSecs = totalMillis / 1000.0; 
		double currentSec = totalSecs % 60;
		long totalMin = totalSecs / 60; 
		long currentMin = totalMin % 60;
		long totalHours = totalMin / 60;	
		//...
		
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
	}

}
