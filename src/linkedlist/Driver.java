package linkedlist;

public class Driver {

	public static void main(String[] args) {
		IntSLList ll = new IntSLList();
		ll.addToHead(8);
		ll.addToHead(9);
		ll.addToTail(30);
		ll.addToTail(22);
		ll.addToTail(13);
		ll.addToTail(105);
		ll.addToTail(105);
		ll.addToTail(17);
		ll.addToTail(22);
		ll.addToHead(96);
		ll.printAll();
		System.out.println();
		System.out.println("Size of LL = " + ll.getSize());
		ll.Sum();
		ll.Max();
		ll.Min();
		ll.removeDuplicates();
		System.out.println();
		ll.printAll();
		System.out.println("Size of LL = " + ll.getSize());
		System.out.println();
		ll.sort();
		System.out.println("Sorted LL = ");
		ll.printAll();
		System.out.println("Medium LL = " + ll.findMiddle());
		System.out.println("Deleting Medium LL = " + ll.findMiddle());
		ll.removeMedium();
		System.out.println();
		ll.printAll();
		System.out.println("Medium LL = " + ll.findMiddle());

	}

}
