package stack.arraystack;

//import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DriverStack {

	public static void main(String[] args) {
		ArrayStack as = new ArrayStack(2);

		// long fullstart = System.nanoTime();
		// for(int a = 0; a < 1000000; a++){
		// long start1 = System.nanoTime();
		// as.push(new Random().nextInt() * 100);
		// long end1 = System.nanoTime();
		// System.out.println( a + " Difference: " + (end1 - start1));
		// }
		// long fullend = System.nanoTime();
		// System.out.println("Full Difference: " + (fullend - fullstart));
		//
		//

		long start = System.nanoTime();
		for (int a = 0; a < 1000000; a++) {
			// long start1 = System.nanoTime();
			// as.push(new Random().nextInt() * 100);

			as.push(1);
			// long end1 = System.nanoTime();
			// System.out.println( a + " Difference: " + (end1 - start1));
		}
		long end = System.nanoTime();
		long difference = end - start;
		System.out.println(
				"Execution Time in Nanoseconds " + TimeUnit.NANOSECONDS.convert(difference, TimeUnit.NANOSECONDS));
		System.out.println(
				"Execution Time in Microseconds " + TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS));
		System.out.println(
				"Execution Time in Milliseconds " + TimeUnit.MILLISECONDS.convert(difference, TimeUnit.NANOSECONDS));
		System.out.println("Execution Time in Seconds " + TimeUnit.SECONDS.convert(difference, TimeUnit.NANOSECONDS));

		// as.push(10);
		// as.push(11);
		// as.push(1);
		// as.push(0);
		// as.push(5);
		// as.printAll();
		// System.out.println("Size " + as.size()); // size of array = this
		// should print 5
		// System.out.println("Pop " + as.pop()); // popped 5 = this should
		// print 5
		// System.out.println();
		// System.out.println("Size " + as.size());
		// as.printAll();
		// System.out.println("Index 11: " + as.indexOf(11)); // 1
		// System.out.println("Index 0: " + as.indexOf(0)); // 3
		// System.out.println("Index 5: " + as.indexOf(5)); // -1
		// System.out.println("Boolean find 11 " + as.find(1)); // true
		// System.out.println("Boolean find 0 " + as.find(0)); // true
		// System.out.println("Boolean find 5 " + as.find(0)); // false
		// // System.out.println();
		// //System.out.println("Peek " + as.peek()); // peek top 0 = this
		// should print 0
		// System.out.println();
		// as.push(12);
		// as.push(14);
		// as.push(20);
		// as.push(21);
		// as.push(22);
		// as.push(23);
		// as.push(24);
		// as.push(25);
		// as.push(26);
		// as.push(27);
		// as.push(28);
		//// as.printAll();
		// System.out.println();
		// System.out.println("Size " + as.size()); // size of array = this
		// should print 15
		// System.out.println();
		//// System.out.println("Peek " + as.peek()); // peek top 28 = this
		// should print 28
		// System.out.println();
		// as.push(29); // full
		// System.out.println();
		// System.out.println("Index of 23 is " + as.indexOf(23));
		// System.out.println("Index of 29 is " + as.indexOf(29));
		// System.out.println("Boolean find 12 " + as.find(12));
		// System.out.println("Boolean find 29 " + as.find(29));
		// as.clear();
		// as.printAll();
		// as.pop();

	}
}
