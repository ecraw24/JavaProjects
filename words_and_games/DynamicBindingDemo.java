
public class DynamicBindingDemo {

	public static void main(String[] args) {
		myPrint(new GraduateStudent());
		myPrint(new Student());
		myPrint(new Person());
		//myPrint(new Object());

	}

	public static void myPrint(Person obj) {
		System.out.println(obj);
		System.out.println("has a degree? " + obj.hasDegree());
	}
}

class GraduateStudent extends Student {
	public boolean hasDegree() {
		return true;
	}
}

class Student extends Person {
	@Override
	public String toString() {
		return "Student";
	}
	
	public boolean hasDegree() {
		return true;
	}
}

class Person {
	@Override
	public String toString() {
		return "Person";
	}
	
	public boolean hasDegree() {
		return false;
	}
	
	public boolean hasDegree(String college) {
		return false;
	}
}
