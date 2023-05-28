package binary_search_tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node("static", "the particular member belongs"
				+ " to a type itself, rather than to an instance of that type");
		BinarySearchTree tree = new BinarySearchTree(root);
		Node wordOne = new Node("polymorphism","the ability of a class to"
				+ " provide different implementations of a method,"
				+ " depending on the type of object that is passed to the method");
		Node wordTwo =  new Node("interface","an abstract type that is used to "
				+ "declare a behavior that classes must implement.");
		Node wordThree =  new Node("object-oriented programming","a computer programming"
				+ " model that organizes software design around data, or objects, "
				+ "rather than functions and logic");
		tree.insert(wordOne);
		tree.insert(wordTwo);
		tree.insert(wordThree);
		
		tree.printBinarySearchTree();
	}

}
