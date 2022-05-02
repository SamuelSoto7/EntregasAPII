package structures;

public class Node {

	private int value;
	private int skipValue;
	private Node previous;
	private Node next;
	
	public Node(int value) {
		this.value = value;
		skipValue = 3;
	}
	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int getSkipValue() {
		return skipValue;
	}

	public void setSkipValue(int skipValue) {
		this.skipValue = skipValue;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	

}