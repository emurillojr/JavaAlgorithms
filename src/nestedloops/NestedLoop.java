package nestedloops;

import java.util.concurrent.TimeUnit;

public class NestedLoop {
	public static void main(String[] args) {

		grid(2, 2);
		grid(4, 4);
		grid(8, 8);
		grid(64, 64);
		grid(128, 128);
		grid(512, 512);

	}

	public static int[][] grid(int row, int column) {
		long start = System.nanoTime();

		int inputX = (int) Math.floor(Math.random() * row);
		int inputY = (int) Math.floor(Math.random() * column);
		int box[][] = new int[row][column];
		box[inputX][inputY] = -1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (box[i][j] == -1) {
					System.out.println("The boss is at (" + i + ", " + j + ")");
				}
			}
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

		return box;
	}

}
