package trees.binarysearchtree;

public class IntBST {

	protected IntBSTNode root;

	public IntBST() { // constructor

	}

	protected void visit(IntBSTNode p) { // print info of node
		System.out.print(p.key + " ");
	}

	public void insert(int el) {
		IntBSTNode p = root;
		IntBSTNode prev = null;

		while (p != null) { // find place for inserting new node
			prev = p;
			if (p.key < el)
				p = p.right;
			else
				p = p.left;

		}

		if (root == null) // tree is empty
			root = new IntBSTNode(el);

		else if (prev.key < el)
			prev.right = new IntBSTNode(el);
		else
			prev.left = new IntBSTNode(el);
	}

	public IntBSTNode search(IntBSTNode p, int el) {
		while (p != null)
			if (el == p.key)
				return p;
			else if (el < p.key)
				p = p.left;
			else
				p = p.right;

		return null;
	}

	// traversing all the nodes in the binary trees
	// add breadthFirst() method
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

	// displaying all the nodes in a binary tree
	// add inorder() method
	protected void inorder(IntBSTNode p) { // printing the elements of tree in order
		if (p != null) {
			inorder(p.left);
			visit(p);
			inorder(p.right);
		}
	}

	// deleting a node in a binary tree
	// add deleteByMerging() method
	public void deleteByMerging(int el) {
		IntBSTNode tmp, node, p = root, prev = null;

		while (p != null && p.key != el) { // find the node p with element el
			prev = p;
			if (p.key < el)
				p = p.right;
			else
				p = p.left;
		}
		node = p;

		if (p != null && p.key == el) {
			if (node.right == null) // node has no right child: its left
				node = node.left; // child(if any) is attached to its parent

			else if (node.left == null)
				node = node.right;

			else {
				tmp = node.left;
				while (tmp.right != null)
					tmp = tmp.right;

				tmp.right = node.right;
				node = node.left;
			}

			if (p == root)
				root = node;
			else if (prev.left == p)
				prev.left = node;
			else
				prev.right = node;
		}

		else if (root != null)
			System.out.println("key" + el + " is not in the tree");
		else
			System.out.println("the tree is empty");
	}

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

		// System.out.println(mytree.search(mytree.root, 7).key);
		// System.out.println(mytree.search(mytree.root, 10).key);
		// System.out.println();

		// mytree.breadthFirst();

		// mytree.inorder(mytree.root);

		// System.out.println("Tree inorder before deleting leaf 29.");
		// mytree.inorder(mytree.root);
		// mytree.deleteByMerging(29);
		// System.out.println("\nTree inorder after deleting leaf 29.");
		// mytree.inorder(mytree.root);

		// System.out.println("Tree inorder before deleting leaf 31.");
		// mytree.inorder(mytree.root);
		// mytree.deleteByMerging(31);
		// System.out.println("\nTree inorder after deleting leaf 31.");
		// mytree.inorder(mytree.root);

		System.out.println("Tree inorder before deleting leaf 13.");
		mytree.inorder(mytree.root);
		mytree.deleteByMerging(13);
		System.out.println("\nTree inorder after deleting leaf 13.");
		mytree.inorder(mytree.root);

	}

}
