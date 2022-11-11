//Emma Crawford
//Programming Assignment 8
//Queue

import java.util.Arrays;

public class QueueStack {
	
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 8; 
	
	public QueueStack() {
		this(DEFAULT_CAPACITY);
	}

	public QueueStack(int capacity) {
		this.size = 0;
		
		//Set capacity of queue
		this.elements = (capacity > 0) ? new int[capacity] : new int[DEFAULT_CAPACITY];
	}
	
	public void enqueue(int value) {
		if (this.size < this.elements.length) {
			this.elements[this.size] = value; 
		} else {
			
			//double capacity if size exceeds current capacity
			int[] temp = new int[this.elements.length * 2]; 
			
			//Copy current array to doubled temp array
			System.arraycopy(this.elements, 0, temp, 0, (this.size));
			
			//Assign value to next available slot
			temp[this.size] = value; 
			this.elements = new int[this.elements.length * 2]; 
			this.elements = temp;
		} 
		
		//Count new value
		this.size++;
	}
	
	public void dequeue() {
		
		//Create temp array 
		int[] temp = new int[this.elements.length]; 
		
		//Copy current queue into temp shifted 1 to the left
		System.arraycopy(this.elements, 1, temp, 0, (this.size-1));
		
		//Document the first element to show the user
		int removed = this.elements[0]; 
		
		//Transfer temp array to current array and decrease size
		this.elements = temp;
		this.size--;
		System.out.println("Element removed: " + removed);
		} 
  
	
	public boolean empty() {
		
		//Return false (not empty) if size is more than zero; otherwise return true
		if (size > 0) {
			return false; 
		} else {
			return true; 
		}
	}
	
	public int getSize() {
		return this.size;
	}
	
	public String printStack() {
		return Arrays.toString(elements);
	}
}

/*
Extra Credit: For 5 points of extra credit, create another version of your Queue class that stores an array of chars internally.  
This Queue should be able to add characters to it, then remove them back out.  
Prompt the user for a String, add each character to your queue, then remove each character from the queue and print them out.  
You should see the same String come back out. */
