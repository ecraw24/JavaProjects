
public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 8;
	
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
		//this.elements = new int[DEFAULT_CAPACITY];
	}
	
	public StackOfIntegers(int capacity) {
		this.size = 0;
		this.elements = (capacity > 0) ? new int[capacity] : new int[DEFAULT_CAPACITY];
		//if (capacity > 0)
		//	this.elements = new int[capacity];
		//else
		//	this.elements = new int[DEFAULT_CAPACITY];
	}
	
	public void push(int value) {
		if (this.size >= this.elements.length) {
			int[] temp = new int[this.elements.length * 2];
			//for (int i = 0; i < this.elements.length; i++) {
			//	temp[i] = this.elements[i];
			//}
			System.arraycopy(this.elements, 0, temp, 0, this.elements.length);
			this.elements = temp;
		}
		
		this.elements[this.size++] = value;
		//this.elements[this.size] = value;
		//this.size++;
	}
	
	public int pop() {
		return this.elements[--this.size];
		//this.size--;
		//return this.elements[this.size];
	}
	
	public int peek() {
		return elements[this.size - 1];
	}

	public boolean empty() {
		return this.size == 0;
		//if (this.size == 0)
		//	return true;
		//else
		//	return false;
	}
	
	public int getSize() {
		return this.size;
	}
}
