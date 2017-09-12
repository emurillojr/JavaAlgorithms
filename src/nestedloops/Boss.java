package nestedloops;

public class Boss {

	public int number = 8;
	public char arr[][] = new char[number][number];
	int a = (int) (Math.random() * number);
	int b = (int) (Math.random() * number);
	int g = 0;
	int w = 0;

	public void grid() {
		for (int i = 0; i < number; i++) {
			if (i == a && g == b) {
				System.out.print("B");
				arr[i][0] = 'B';
			} else {
				System.out.print("l");
				arr[i][0] = 'l';
			}

			for (int g = 1; g < number; g++) {
				if (i == a && g == b) {
					System.out.print("B");
					arr[i][g] = 'B';
				} else {
					System.out.print("l");
					arr[i][g] = 'l';
				}
			}
			System.out.println();
		}

	}

	public void findBoss() {
		for (int t = 0; t < number; t++) {
			if (arr[t][0] == 'B') {
				System.out.println("B was found");
				System.out.println("B was in position " + t + " 0");
			}
			for (w = 1; w < number; w++) {
				if (arr[t][w] == 'B') {
					System.out.println("B was found");
					System.out.println("B was in position " + t + " " + (w));
				}
			}
		}
	}
}
