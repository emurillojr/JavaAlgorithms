package stack.que;

public class LLStack {
	// LinkedList<Integer> list = new LinkedList<Integer>();

	protected IntSLLNode head, tail;

	public void clear() {
		if (!isEmpty()) {
			for (IntSLLNode end = tail; end != null; end = end.next) {
				dequeue();
			}

		}
	}

	public boolean isEmpty() {
		return tail == null;
	}

	// add 1 to END tail
	public void enqueue(int el) {
		if (!isEmpty()) {
			tail.next = new IntSLLNode(el);
			tail = tail.next;
		} else {
			head = tail = new IntSLLNode(el);
		}
	}

	// remove one from top head
	public int dequeue() {
		int el = head.info;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}
		return el;
	}

	// see end tail
	public void firstEl() {
		System.out.println(head.info);
	}

	public void printAll() {
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next)
			System.out.println(tmp.info + " ");
	}

}
