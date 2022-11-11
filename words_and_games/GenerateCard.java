// Polymorphism example.
// This file contains the definition of an abstract class Card, followed by many implementations of classes that
// inherit from Card.  Normally each class would be in its own file so it could be reused by other programs, but for
// simplicity in this example, they are all defined in this one file.
// At the bottom is main, which prompts the user for what type of Card they would like, fills in the details depending on 
// their choice, then calls makeCard.
// The key to polymorphism is that only one variable, cardRef, was needed in main.  It is filled with whatever Card type,
// then no matter what, cardRef.makeCard is called.  We didn't need to make separate variables in every case.


import java.io.*;
import java.util.*;

// Generic Card interface, defining what every Card should have.
abstract class Card
{
	// Every card has a to and from.
  	protected String recipient, from;
	
	// Every card has a way to "make" itself.
  	public abstract void makeCard();
}

// Christmas Car.
// Writes a nice Christmas message.
class Christmas extends Card
{
  	public Christmas(String recip, String send)
  	{
    	recipient = recip;
    	from = send;
  	}

  	public void makeCard()
  	{
    	System.out.println("Dear " + recipient + ",\n");
    	System.out.println("Merry Christmas!\n\n");
    	System.out.println("Warmest regards, " + from + "\n\n");
  	}
}

// Birthday Card.
// Includes the recipient's age in the message.
class Birthday extends Card
{
  	int age;

  	public Birthday(String recip, int years, String send)
  	{
    	recipient = recip;
    	age = years;
    	from = send;
  	}

  	public void makeCard()
  	{
    	System.out.println("Dear " + recipient + ",\n");
    	System.out.println("You're " + age + " years old today. Hope you had a great day.\n");
    	System.out.println("Happy Birthday!\n\n");
    	System.out.println("Warmest regards, " + from + "\n\n");
  	}
}

// Valentine Card.
// Includes XOs for as long as the recipient's name is.
class Valentine extends Card
{
  	int XOs;

  	public Valentine(String recip, String send)
  	{
    	recipient = recip;
    	XOs = recip.length();
    	from = send;
  	}

  	public void makeCard()
  	{
    	System.out.println("Dear " + recipient + ",\n");
    	System.out.println("I love you!  Happy Valentine's Day.\n");
    	for (int j = 0; j < XOs; j++)
		{
  	    	System.out.print("XO");
		}
    	System.out.println("\n\n");
    	System.out.println(from + "\n\n");
  	}
}

// Get Well Card.
// Writes a get well message.
class GetWell extends Card
{
  	public GetWell(String recip, String send)
  	{
    	recipient = recip;
    	from = send;
  	}

  	public void makeCard()
  	{
    	System.out.println("Dear " + recipient + ",\n");
    	System.out.println("Get well soon. My thoughts are with you.\n");
    	System.out.println("\n\n");
    	System.out.println("Warmest regards, " + from + "\n\n");
  	}
}

// Thank You Card.
// WRites a nice thank-you message.
class ThankYou extends Card
{
  	public ThankYou(String recip, String send)
  	{
    	recipient = recip;
    	from = send;
  	}

  	public void makeCard()
  	{
    	System.out.println("Dear " + recipient + ",\n");
    	System.out.println("Thank you, not only for what you did, which was wonderful, but for the way you did it.\n");
    	System.out.println("\n\n");
    	System.out.println("Warmest regards, " + from + "\n\n");
  	}
}

// Anniversary Card.
// Writes an anniversary message.
class Anniversary extends Card
{
  	public Anniversary(String recip, String send)
  	{
    	recipient = recip;
    	from = send;
  	}

  	public void makeCard()
  	{
    	System.out.println("Dear " + recipient + ",\n");
    	System.out.println("Happy Anniversary.  May you have many more to come.\n");
   	System.out.println("\n\n");
    	System.out.println("Warmest regards, " + from + "\n\n");
  	}
}

// New Baby Card.
// Writes a congratulatory new baby message.
class NewBaby extends Card
{
  	public NewBaby(String recip, String send)
  	{
    	recipient = recip;
    	from = send;
  	}

  	public void makeCard()
  	{
    	System.out.println("Dear " + recipient + ",\n");
    	System.out.println("Congratulations on the new addition to your family.\n");
    	System.out.println("\n\n");
    	System.out.println("Warmest regards, " + from + "\n\n");
  	}
}

// Congratulations Card.
// Writes a generic congratulatory message.
class Congratulations extends Card
{
  	public Congratulations(String recip, String send)
  	{
    	recipient = recip;
    	from = send;
  	}

  	public void makeCard()
  	{
    	System.out.println("Dear " + recipient + ",\n");
    	System.out.println("Congratulations. We are so proud of you.\n");
    	System.out.println("\n\n");
    	System.out.println("Warmest regards, " + from + "\n\n");
  	}
}

// Blank Card.
// Includes a message that is written in the card.
class Blank extends Card
{
 	String personalM;

  	public Blank(String recip, String message, String send)
  	{
    	recipient = recip;
    	personalM = message;
    	from = send;
  	}

  	public void makeCard()
  	{
    	System.out.println("Dear " + recipient + ",\n");
    	System.out.println(personalM);
    	System.out.println("\n\n");
    	System.out.println("Warmest regards, " + from + "\n\n");
  	}
}

// Main program.
// Show the user a menu, then generate the appropriate Card type based on their choice.
// No matter what the Card type ends up being, makeCard will be called in the correct class
// because of polymorphism!
public class GenerateCard
{
  	static Scanner console = new Scanner(System.in);
  	public static void main ( String[] args ) throws IOException
  	{
    	String receiver, sender, message;
    	int cardType;

		// Prompt the user for the sender and the recipient.
    	System.out.println("Who would you like to send the card to?");
    	receiver = console.nextLine();
    	System.out.println("Who is this card from?");
    	sender = console.nextLine();

		// Prompt the user for the card type.
		System.out.println("Type in the number of the card you would like to send.  Choose from the list below");
		System.out.println("1. Christmas");
		System.out.println("2. Valentine's");
		System.out.println("3. Birthday");
		System.out.println("4. Get Well Soon");
		System.out.println("5. Anniversary");
		System.out.println("6. New Baby");
		System.out.println("7. Thank you");
		System.out.println("8. Congratulations");
		System.out.println("9. Blank");
		cardType = console.nextInt();

		// No matter what the user chooses from the menu, fill the Card reference object.
		Card cardRef = null;
		
		switch (cardType)
		{
			case 1:
				cardRef = new Christmas(receiver, sender);
				break;
				
			case 2:
				cardRef = new Valentine(receiver, sender);
				break;

			case 3:
				System.out.println("How old will " + receiver + " be?" );
   			int age = console.nextInt();

				cardRef = new Birthday(receiver, age, sender);
				break;
				
			case 4:
				cardRef = new GetWell(receiver, sender);
				break;
				
			case 5:
				cardRef = new Anniversary(receiver, sender);
				break;
				
			case 6:
				cardRef = new NewBaby(receiver, sender);
				break;
				
			case 7:
				cardRef = new ThankYou(receiver, sender);
				break;
				
			case 8:
				cardRef = new Congratulations(receiver, sender);
				break;
				
			case 9:
    			System.out.println("What would you like to write in your card to " + receiver + "?" );
				
    			// Skip the carriage return (enter key) from the last integer 9 input, console.nextInt ignores it.			
				console.nextLine(); 
				
				// Now read the full line message and enter key from the user.
    			message = console.nextLine();
				
    			cardRef = new Blank(receiver, message, sender);
				break;

			default:
		    	System.out.println("Error in choice!");
  
  		}
		
		// If cardRef was filled, just call makeCard now on it, it will do the right thing!
		if (cardRef != null) 
		{
			cardRef.makeCard();
		}
	}
}
