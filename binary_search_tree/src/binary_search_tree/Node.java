package binary_search_tree;

public class Node {
	
	private String word;
	private String definition; 
	private Node rightChild;
	private Node leftChild;
	
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
	}
	
	public static String getWord(Node node) {
		return node.word;
	}
	
	public String getDefinition() {
		return definition;
	}


	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	//	public void setLeftChild(Node current, Node left) {
	//	current.leftChild = left;
	//}
	
	//public void setRightChild(Node current, Node right) {
	//	current.rightChild = right;
	//}

}
