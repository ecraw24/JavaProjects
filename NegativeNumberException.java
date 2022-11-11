
public class NegativeNumberException extends Exception
{
	public NegativeNumberException()
	{
		super("Negative number not allowed");
	}
	
	public NegativeNumberException(String str)
	{
		super(str);
	}
}
