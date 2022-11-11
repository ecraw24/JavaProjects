// Test our Person class.
// Declare several Person objects and try out all our methods.
public class TestPerson
{
	public static void main(String[] args)
	{
		System.out.println("counter = " + Person.counter);
		
		Person p1 = new Person();
		p1.setFirstName("Joe");
		p1.setLastName("Wilson");
		System.out.println("firstname = " + p1.getFirstName());
		System.out.println("lastname = " + p1.getLastName());
		
		p1.setName("Mary", "Jones");
		System.out.println("name = " + p1.getName());
		System.out.println(p1);
		
		p1.setFirstName("badword");
		System.out.println("firstname = " + p1.getFirstName());
		
		p1.counter = 5;
		
		Person p2 = new Person("Joe", "Schmoe");
		System.out.println(p2);
		
		System.out.println("counter = " + p2.counter);
	}
}