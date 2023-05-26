package binary_search_tree;

public class BinarySearchTree {
	
	private  Node root;
	
	public BinarySearchTree(Node root) {
		this.root = root;
	}

	
	public void insert(Node node) {
		
		Node currentNode = this.root;
		while (currentNode != null) {
			//smaller
			if (node.getWord().compareTo(currentNode.getWord()) <= 0) {
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


	public  Node getRoot() {
		return root;
	}
	
	public static void printBinarySearchTree(BinarySearchTree tree) {
		Node currentNode = tree.getRoot();
		
		
		//tree size and pq size matter
		
		//tree that will be printed
		Queue treeQueue = new Queue(tree.getRoot());
		//keeps track of place in tree for BFS
		Queue visited = new Queue(tree.getRoot());
		
		//
		while(!visited.isEmpty()) {
			//current node's right child
			Node rightChild = currentNode.getLeftChild();
			//current node's left child
			Node leftChild = currentNode.getRightChild();
			if (leftChild != null) {
				treeQueue.enqueue(leftChild);
				visited.enqueue(leftChild);
			}
			if (rightChild != null) {
				treeQueue.enqueue(rightChild);
				visited.enqueue(rightChild);
			}
			
			
			//pop off front of queue
			visited.dequeue();
			
			//reassign current node based on visited queue
			currentNode = visited.peek();
			
		}
		
		
		//print treeQueue
		currentNode = treeQueue.getFront();
		while (currentNode.equals(treeQueue.getFront().getNext())) {
			System.out.println(currentNode.getWord());
			currentNode = currentNode.getNext();
		}
	}

}
