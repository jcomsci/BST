package binary_search_tree;

public class Queue {

	private Node front;
	private Node rear;
	private int size;
	//private static Node next;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Queue(Node node) {
		front = node;
		rear = node;
		size = 1;
	}
	
	public void enqueue(Node node) {
		//keep track whether queue can be empty
		Node currentNode = front;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(node);
		rear = currentNode.getNext();
		
		size++;
	}
	
	public Node dequeue() {
		
		Node frontNode = front;
		
		//we will dequeue front, and have no reference to the node after 
		//front if we dequeue it before reassigning front
		front = front.getNext();
		
		size--;
		
		return frontNode;
		
	}
	
	public Node peek() {
		return front;
	}
	
	public Node getFront() {
		return this.front;
	}
	
	public Node getRear() {
		return this.rear;
	}
	
	public boolean isEmpty() {
		return size <= 0;
	}
	

}
