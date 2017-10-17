package binary.tree;

public class BinarySearchTree {

	//Initialize variables
	public static Node root;
	
	//default constructor
	public BinarySearchTree() {
		this.root = null;
	}
	
	public boolean find(int id) {
		//start at the root node
		Node current = root;
		
		while(current != null) {
			// if the current node has the data, then it is in the tree
			if(current.data == id){
				return true;
			//if current data is > id, then we go to the lhs which has a smaller value
			}else if(current.data > id) {
				current = current.lhs;
			}else {
				current = current.rhs;
			}
		}
		return false;
	}
	
	public boolean delete(int id) {
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(current.data!=id) {
			parent = current;
			if(current.data > id) {
				isLeftChild = true;
				current = current.lhs;
			} else {
				isLeftChild = false;
				current = current = current.rhs;
			}
			if(current == null) {
				return false;
			}
		}
		//The node has been found
		//if node has no children, do this
		if(current.lhs == null && current.rhs == null) {
			if(current == root) {
				root = null;
			}
			if(isLeftChild == true) {
				parent.lhs = null;
			} else {
				parent.rhs = null;
			}
		}
		//if node has one child, do this
		if(current.rhs == null) {
			if(current == root) {
				root = current.lhs;
			} else if (isLeftChild) {
				parent.lhs = current.lhs;
			} else {
				parent.rhs = current.lhs;
			}
		}
		else if (current.lhs != null && current.rhs != null) {
			Node successor = getSuccessor(current);
			if(current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.lhs = successor;
			} else {
				parent.rhs = successor;
			}
			successor.lhs = current.lhs;
		}
		return true;
	}

	public Node getSuccessor(Node deleteNode) {
		Node successor = null;
		Node successorParent = null;
		Node current = deleteNode.rhs;
		
		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.lhs;
		}
		// shuffling occurs where
		// successor cannot have a rhs
		// if it does, add to lhs of successorParent
		if(successor != deleteNode.rhs) {
			successorParent.lhs = successor.rhs;
			successor.rhs = deleteNode.rhs;
		}
		return successor;
	}
	
	public void insert(int id) {
		Node newNode = new Node(id);
		if(root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true) {
			parent = current;
			if(id < current.data) {
				current = current.lhs;
				if(current == null) {
					parent.lhs = newNode;
					return;
				}
			} else {
				current = current.rhs;
				if(current == null) {
					parent.rhs = newNode;
							return;
				}
			}
		}
	}

	
	public void display(Node root) {
		if(root != null) {
			display(root.lhs);
			System.out.println(" " + root.data);
			display(root.rhs);
		}
	}
	
	
	public static void main(String[] arg) {
		BinarySearchTree b = new BinarySearchTree();
		b.insert(3);b.insert(8);
		b.insert(1);b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
		b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);		
		System.out.println("");
		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
		System.out.println("Delete Node with no children (2) : " + b.delete(2));		
		b.display(root);
		System.out.println("\n Delete Node with one child (4) : " + b.delete(4));		
		b.display(root);
		System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));		
		b.display(root);
	}
}
