
public class Attention extends Behavior {

	boolean isAggressive; 
	
	public Attention() {
		super(); 
	}
	
	public Attention(Type type) throws Exception {
		if (type.toString().equals("Person")) {
			setType(type);
		} else {
			throw new Exception("Invalid type. Attention can only be of type Person."); 
		}
	}

	public void teachHelp() throws Exception {
		if (this.severity == 0) {
			throw new Exception("Severity is already 0. Train a a caregiver instead."); 
		} else {
			this.severity--;
		} 
		if (severity == 0 && frequency == 0) {
			goalMet();  
		}
		
		System.out.println("Your client improved their ability to ask for help. Great job!");
			
	}

	@Override
	public int compareTo(String o) {
		if (Behavior.target == o) {
			return 1; 
		} else {
			return 0; 
		}
	}

	public boolean isAggressive() {
		return this.isAggressive;
	}

	public void setAggressive(boolean isAggressive) {
		this.isAggressive = isAggressive;
	}
}
