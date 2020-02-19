package mockTest;

public class Node extends LinearList {
	private Car data;
	private Node next;
	
	
	
	public Node() {
		super();
		
	}


	public Node(Car data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	
	public Node(Node node) {
		super();
		this.data = node.data;
		this.next = node.next;
	}


	public Car getData() {
		return data;
	}


	public void setData(Car data) {
		this.data = data;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}


	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

	
	public void display() {
		System.out.println(toString());
	}
	
}
