package binary_search_tree;

public class BinarySearchTree {
	
	private static Node root;
	
	public BinarySearchTree(Node root) {
		this.root = root;
	}

	
	public static void insert(Node node) {
		
		Node currentNode = root;
		while (currentNode != null) {
			//smaller
			if (Node.getWord(node).compareTo(Node.getWord(currentNode)) <= 0) {
				if (currentNode.getLeftChild() == null) {
					currentNode.setLeftChild(node);
					break;
				} else {
					continue;
				}
				//currentNode.setLeftChild(currentNode, currentNode);
			} else {
				if (currentNode.getRightChild() == null) {
					currentNode.setRightChild(node);
					break;
				} else {
					continue;
				}
				//currentNode.setRightChild(currentNode, currentNode);
			}
			//greater
		}
		
	}

}
