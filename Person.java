// Class to represent a person.
// Store a firstname, lastname, and all the methods
// associated with them.
public class Person
{
	// Static counter, shared by all Person objects.
	public static int counter;
	
	private String firstname;
	private String lastname;

	// Default constructor.
	public Person()
	{
		setName("", "");
		counter++;
	}
	
	// Initializing constructor.
	public Person(String fn, String ln)
	{
		setName(fn, ln);
		counter++;
	}
	
	public void setFirstName(String fn)
	{
		if (fn.equals("badword"))
		{
			this.firstname = "";
		}
		else
		{
			this.firstname = fn;
		}
	}
	
	public void setLastName(String ln)
	{
		this.lastname = ln;
	}
	
	public void setName(String fn, String ln)
	{
		setFirstName(fn);
		setLastName(ln);
	}
	
	public String getName()
	{
		return firstname + " " + lastname;
	}
	
	public String getFirstName()
	{
		return firstname;
	}
	
	public String getLastName()
	{
		return this.lastname;
	}

	// Instead of doing System.out.println here, do that
	// in main. 	
	//public void printName()
	//{
		//System.out.println(firstname + " " + lastname);
	//}
	
	public String toString()
	{
		return this.firstname + " " + this.lastname;
	}
}