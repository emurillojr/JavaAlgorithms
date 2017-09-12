package stack.stack;

public class LLStack {

	protected IntSLLNode head, tail;

	public void clear() {
		if (!isEmpty()) {
			for (IntSLLNode top = head; top != null; top = top.next) {
				pop();
			}

		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	// add 1 to top
	public void push(int el) {
		head = new IntSLLNode(el, head);
		{
			if (tail == null) {
				tail = head;
			}
		}
	}

	// remove one from top
	public int pop() {
		int el = head.info;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}
		return el;
	}

	// see top head
	public void peek() {
		System.out.println(head.info);
	}

	public void printAll() {
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next)
			System.out.println(tmp.info + " ");
	}

}
