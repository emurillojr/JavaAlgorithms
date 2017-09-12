package trees.bstRecursive;

public class IntBST {

	private IntBSTNode root;

	public IntBST() { // constructor
		root = null;
	}

	/* Function to check if tree is empty */
	public boolean isEmpty() {
		return root == null;
	}

	// ************************************ insert recursively
	/* Functions to insert data */
	public void insert(int data) {
		root = insert(root, data);
	}

	/* Function to insert data recursively */
	private IntBSTNode insert(IntBSTNode node, int data) {
		if (node == null)
			node = new IntBSTNode(data);  // make it first
		else {
			if (data <= node.getKey())
				node.left = insert(node.left, data);  // if <=  insert to left side
			else
				node.right = insert(node.right, data); // else >= insert to right side
		}
		return node;
	}
	// ************************************

	protected void visit(IntBSTNode p) { // print info of node
		System.out.print(p.key + " ");
	}

	// ************************************ search recursively
	// Function to search for an element
	public boolean search(int val) {
		return search(root, val);
	}

	// Function to search for an element recursively
	private boolean search(IntBSTNode r, int val) {
		boolean found = false;
		while ((r != null) && !found) {   // while unequal to null and not found
			int rval = r.getKey();   // get the right key of int val
			if (val < rval)   // 
				r = r.getLeft();
			else if (val > rval)
				r = r.getRight();
			else {
				found = true;
				break;
			}
			found = search(r, val);
		}
		return found;
	}
	// ************************************

	// traversing all the nodes in the binary trees
	// add breadthFirst() method
	// The BFS algorithm is not a recursive algorithm
	public void breadthFirst() { // visiting top-to-bottom-left-to-right
		IntBSTNode p = root;
		Queue queue = new Queue(); // using custom-built Queue, not from util

		if (p != null) {
			queue.enqueue(p);
			while (!queue.isEmpty()) {
				p = (IntBSTNode) queue.dequeue();
				visit(p);
				if (p.left != null)
					queue.enqueue(p.left);
				if (p.right != null)
					queue.enqueue(p.right);
			}
		}
	}

	// Function to count number of nodes
	public int countNodes() {
		return countNodes(root);
	}

	// Function to count number of nodes recursively
	private int countNodes(IntBSTNode r) {
		if (r == null)
			return 0;
		else {
			int l = 1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}

	// ************************************ Depth First Traversal Inorder
	// Inorder Traversal (Left-Root-Right)
	public void inorder() {
		inorder(root);
	}

	private void inorder(IntBSTNode r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getKey() + " ");
			inorder(r.getRight());
		}
	}
	// ************************************

	// ************************************ Depth First Traversal Preorder
	// Preorder Traversal (Root-Left-Right)
	public void preorder() {
		preorder(root);
	}

	private void preorder(IntBSTNode r) {
		if (r != null) {
			System.out.print(r.getKey() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}
	// ************************************

	// ************************************ Depth First Traversal Postorder 
	// Postorder Traversal (Left-Right-Root)
	public void postorder() {
		postorder(root);
	}

	private void postorder(IntBSTNode r) {
		if (r != null) {
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getKey() + " ");
		}
	}
	// ************************************

	// ************************************ delete recursively
	// Function to delete key
	public void delete(int k) {
		if (isEmpty())
			System.out.println("Tree Empty");
		else if (search(k) == false)
			System.out.println("Sorry " + k + " is not present");
		else {
			root = delete(root, k);
			System.out.println(k + " deleted from the tree");
		}
	}

	// Function to delete an element recursively
	private IntBSTNode delete(IntBSTNode root, int k) {
		IntBSTNode p, p2, n;
		if (root.getKey() == k) {
			IntBSTNode lt, rt;
			lt = root.getLeft();
			rt = root.getRight();
			if (lt == null && rt == null)
				return null;
			else if (lt == null) {
				p = rt;
				return p;
			} else if (rt == null) {
				p = lt;
				return p;
			} else {
				p2 = rt;
				p = rt;
				while (p.getLeft() != null)
					p = p.getLeft();
				p.setLeft(lt);
				return p2;
			}
		}
		if (k < root.getKey()) {
			n = delete(root.getLeft(), k);
			root.setLeft(n);
		} else {
			n = delete(root.getRight(), k);
			root.setRight(n);
		}
		return root;
	}
	// ************************************

	public static void main(String[] args) {

		IntBST mytree = new IntBST();

		mytree.insert(13);
		mytree.insert(10);
		mytree.insert(2);
		mytree.insert(12);
		mytree.insert(25);
		mytree.insert(20);
		mytree.insert(31);
		mytree.insert(29);
		System.out.println(mytree.search(mytree.root, 7));
		System.out.println(mytree.search(mytree.root, 10));
		System.out.println("Tree Breadth First Traversal.");
		mytree.breadthFirst();
		System.out.println();
		System.out.println("Tree Depth First Traversal Inorder.");
		mytree.inorder(mytree.root);
		System.out.println();
		System.out.println("Tree Depth First Traversal Preorder.");
		mytree.preorder(mytree.root);
		System.out.println();
		System.out.println("Tree Depth First Traversal Postorder.");
		mytree.postorder(mytree.root);
		System.out.println();
		System.out.println("Number of nodes = " + mytree.countNodes());
		mytree.delete(13);
		System.out.println("Tree inorder after deleting leaf 13.");
		mytree.inorder(mytree.root);
		System.out.println(mytree.countNodes());
		System.out.println("Number of nodes = " + mytree.countNodes());

	}

}
