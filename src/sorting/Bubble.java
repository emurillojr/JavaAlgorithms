package sorting;

public class Bubble {

	 int[] data = { 5, 2, 3, 8, 1 };
	//int[] data = { 10, 23, 144, 55, 999, 7, 3, 11, 37, 37 };
	
	// bubble sort
	public int[] sort(int[] data) {
		int len = data.length; // size of array

		for (int pass = 1; pass < len; pass++) {
			System.out.println("\nPass = " + pass);
			for (int compares = 0; compares < len - pass; compares++) {
				System.out.println(compares);
				if (data[compares] > data[compares + 1]) { // asc order
					// if (data[compares] < data[compares + 1]) { // desc order
					// swap
					int temp = data[compares];
					data[compares] = data[compares + 1];
					data[compares + 1] = temp;
				}
			}
		}	
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
		Bubble bubble = new Bubble();
		bubble.printData();

		bubble.sort(bubble.data);

		System.out.println("The sorted order: ");
		bubble.printData();
	}

}


// n - 1
// n - pass

