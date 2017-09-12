package stack.que;

public class LLTest {

	public static void main(String[] args) {
		LLStack ll = new LLStack();
		ll.enqueue(5); // add tail now head
		ll.enqueue(10); // add tail
		ll.enqueue(4); // add tail
		ll.enqueue(3); // add tail
		ll.printAll();
		System.out.println();
		ll.firstEl(); // head
		System.out.println();
		ll.dequeue(); // remove head
		ll.printAll();
		System.out.println();
		ll.clear();
		ll.enqueue(1); // add tail
		ll.enqueue(11); // add tail 1 is now head
		ll.printAll();

	}

}
