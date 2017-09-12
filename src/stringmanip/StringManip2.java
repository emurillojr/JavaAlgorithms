package stringmanip;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StringManip2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// String input = "Tyler is my name";
		String input = "";
		String strToAdd = "";
		String strToRemove = "";
		int exitSequence = -1;
		// do it without an arrayList

		ArrayList<String> stringHolder = new ArrayList<String>();

		System.out.println("Please enter a string");
		input = keyboard.nextLine();

		for (int j = 0; j != exitSequence; j++) {
			int space = input.indexOf(' ');
			if (space == -1) {
				stringHolder.add(input);
				break;
			}
			for (int i = 0; i < space; i++) {
				strToAdd += input.charAt(i);
			}
			stringHolder.add(strToAdd);
			strToRemove = input.substring(0, space + 1);
			input = input.replace(strToRemove, ""); // reset string
			strToAdd = "";
		}

		for (int t = stringHolder.size(); t > 0; t--) {
			System.out.println(stringHolder.get(t - 1));
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

		keyboard.close();

	}

}
