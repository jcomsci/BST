package binary_search_tree;

public class Node {
	
	private String word;
	private String definition; 
	private Node rightChild;
	private Node leftChild;
	private Node next;
	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	//constructor
	public Node(String word, String definition) {
		this.word = word;
		this.definition = definition;
		this.setRightChild(null);
		this.setLeftChild(null);
		setNext(null);
	}
	
	public String getWord() {
		return this.word;
	}
	
	public String getDefinition() {
		return this.definition;
	}


	public Node getLeftChild() {
		return this.leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return this.rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public void getString() {
		System.out.print(this.word + ": " + this.definition);
	}
	
	//	public void setLeftChild(Node current, Node left) {
	//	current.leftChild = left;
	//}
	
	//public void setRightChild(Node current, Node right) {
	//	current.rightChild = right;
	//}

}
