package stack.stack;

public class LLTest {

	public static void main(String[] args) {
		LLStack ll = new LLStack();
		ll.push(8);
		ll.push(9);
		ll.push(30);
		ll.push(22);
		ll.push(13);
		ll.printAll();
		ll.peek();
		ll.pop();
		ll.clear();
		ll.push(1);
		ll.printAll();

	}

}
