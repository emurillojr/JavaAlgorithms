package stringmanip;

import java.util.concurrent.TimeUnit;

public class StringManip1 {

	public static void main(String[] args) {
		// String manipulation using built in functions
		String input = "my name is ernesto";
		String[] inputString = input.split(" ");
		int inputLen = inputString.length;
		for (int i = inputLen; i > 0; i--) {
			// System.out.println(i);
			System.out.println(inputString[i - 1]);
		}

		// Execution time algorithm
		long length = 1000000000L;
		long start = System.nanoTime();
		for (int index = 0; index < length; index++) {

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

	}
}
