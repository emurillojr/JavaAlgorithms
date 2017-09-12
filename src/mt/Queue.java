package mt;

import java.util.LinkedList;

public class Queue {
	private LinkedList<Object> queue = new LinkedList<Object>();

	public boolean isEmpty() {
		return (queue.size() == 0);
	}

	public void enqueue(Object obj) {
		queue.addLast(obj);
	}

	public Object dequeue() {
		return queue.removeFirst();
	}

}
