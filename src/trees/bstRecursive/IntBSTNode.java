package trees.bstRecursive;

public class IntBSTNode {
	
	// Member variables
	protected int key;			// the info
	protected IntBSTNode left;	// reference to left child
	protected IntBSTNode right;	// reference to the right child

	public IntBSTNode(){		// default constructor
		left = right = null;	// node without children
		key = 0;
	}
	
	public IntBSTNode(int el){	// overloaded constructor
		this(el, null, null);	// build this node without children
	}
	
	public IntBSTNode(int el, IntBSTNode lt, IntBSTNode rt){
		key = el;
		left = lt;
		right = rt;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public IntBSTNode getLeft() {
		return left;
	}

	public void setLeft(IntBSTNode left) {
		this.left = left;
	}

	public IntBSTNode getRight() {
		return right;
	}

	public void setRight(IntBSTNode right) {
		this.right = right;
	}

	
	
}
