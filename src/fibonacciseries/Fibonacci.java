package fibonacciseries;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//One for loop makes the BigO Notation O(N)
public class Fibonacci {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		System.out.println("Enter a number");
		number = keyboard.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		long start = System.nanoTime();
		System.out.println(n1);
		System.out.println(n2);
		for (int fib = 0; fib < number; fib++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		long end = System.nanoTime();
		long difference = end - start;
		System.out.println("Fibonacci Execution Time in Nanoseconds "
				+ TimeUnit.NANOSECONDS.convert(difference, TimeUnit.NANOSECONDS));
		keyboard.close();
	}
}
