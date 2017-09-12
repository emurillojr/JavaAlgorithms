package trees.bstRecursive;

import java.util.LinkedList;

public class Queue {
	private LinkedList<Object> queue = new LinkedList<Object>();
	
	public Queue(){
		
	}
	
	public void clear(){
		queue.clear();
	}
	
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	public Object firstE(){
		return queue.getFirst();
	}
	
	public Object dequeue(){
		return queue.removeFirst();
	}

	public void enqueue(Object el){
		queue.addLast(el);
		
	}
	
	public String toString(){
		return queue.toString();
	}
}
