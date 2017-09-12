package sorting;

public class Bubble2 {

	// sort Strings and time how long
	// String[] data = { "cat", "Apple", "apple", "George", "NEIT" };
	String[] data = { "cat", "pear", "apple", "george", "neit" };

	// bubble sort Strings
	public String[] sort(String[] data) {

		long start, stop, elapsed;
		start = System.currentTimeMillis();

		int len = data.length; // size of array

		for (int pass = 1; pass < len; pass++) {
			System.out.println("\nPass = " + pass);
			for (int compares = 0; compares < len - pass; compares++) {
				System.out.println(compares);
				if (data[compares].compareTo(data[compares + 1]) > 0) { // asc order
					// if ( data[compares].compareTo(data[compares + 1]) < 0) { // desc order
					// swap
					String temp = data[compares];
					data[compares] = data[compares + 1];
					data[compares + 1] = temp;
				}
			}
		}
		stop = System.currentTimeMillis();
		elapsed = stop - start;
		System.out.println("Elapsed: " + elapsed);

		return data;

	}

	public void printData() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		System.out.println("The unsorted order: ");
		Bubble2 bubble = new Bubble2();
		bubble.printData();

		bubble.sort(bubble.data);

		System.out.println("The sorted order: ");
		bubble.printData();
	}

}
