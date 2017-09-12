package searchingandhashing;

public class Search {

	// 2-dimensional table representing records in your file
	String[][] data = {
			// key name age e-mail
			{ "K0", "Abby Linc", "18", "al@ch.org" }, // record 1
			{ "K1", "John Doe", "23", "jd@abc.com" }, // record 2
			{ "K2", "Janet Basco", "39", "jb@ids.com" }, // record 3
			{ "K3", "Charles River", "64", "cr@neit.edu" }, // record 4
			{ "K4", "Barak Obama", "50", "bo@democrat.gov" }, // record 5
			{ "K5", "Sarah Palin", "44", "sp@republican.gov" }, // record 6
			{ "K6", "John McCain", "72", "jm@it.com" }, // record 7
			{ "K7", "George Bush", "54", "gb@white.com" }, // record 8
			{ "K8", "Al Gore", "56", "ag@vp.edu" }, // record 9
			{ "K9", "Dick Cheney", "60", "dc@vp.gov" }, // record 10

	};

	// sequential search
	public int sequential(String keyToSearch) { // Search Method 1
		System.out.println("Searching for " + keyToSearch + " using sequenctial method.");
		int i;
		for (i = 0; i < data.length; i++) {
			System.out.println("Read " + i + ", key= " + data[i][0]);
			if (keyToSearch.equalsIgnoreCase(data[i][0])) {
				break; // if found then prematurely abort loop
			}
		}

		if (i >= data.length) {
			i = -1; // -1 means not found
			System.out.println("Key " + keyToSearch + " is not found.");
		} else {
			System.out.println("Key " + keyToSearch + " is found at index " + i);
			System.out.println("after " + (i + 1) + " reads.");
		}
		return i;

	}

	// binary search
	public int binary(String keyToSearch) { // Search method 2
		System.out.println("Searching for " + keyToSearch + " using binary method.");
		int len = data.length;
		int index = 0;
		int tries = 0;
		int upper = len;
		int foundAtIndex = -1; // assume will not be found
		int previous = 0;

		index = len / 2; // start search in the middle of the table
		do {
			System.out.println("Read " + index + ", key= " + data[index][0]);
			tries++;
			if (keyToSearch.equalsIgnoreCase(data[index][0])) {
				foundAtIndex = index;
				break;
			} else {
				if (keyToSearch.compareToIgnoreCase(data[index][0]) > 0) {
					index = (index + upper) / 2;
					if (index == previous)
						index++;
				} else {
					upper = index; // new upper limit
					index = index / 2;
					if (index == previous)
						index--;
				}
				previous = index;
			}

		} while (index >= 0 && index < len);

		if (foundAtIndex == -1) {
			System.out.println("Key " + keyToSearch + " is not found");
		} else {
			System.out.println("Key " + keyToSearch + " is found at index " + foundAtIndex);
			System.out.println("after " + tries + " reads.");
		}
		// Returns the index where the key was found.
		return foundAtIndex;

	}

	/////////
	public int hashRoutine(String keyToSearch) { // converts key to index
		int len = keyToSearch.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			int decVal = keyToSearch.charAt(i);
			sum = sum + decVal;
			// System.out.println("Character " + (char)keyToSearch.charAt(i) + " = " +
			// decVal);
		}
		return sum;
	}

	/////////
	public int divideMethod(String keyToSearch) {
		int len = keyToSearch.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			int decVal = keyToSearch.charAt(i);
			sum = sum + decVal;
			// System.out.println("Character " + (char)keyToSearch.charAt(i) + " = " +
			// decVal);
		}
		sum = sum % 10; // Use modulo % operator to generate address between 0 to 10
		return sum;
	}

	String[][] datahashed = new String[135][4];

	// hashed search
	public int hash(String keyToSearch) { // Search method 3
		System.out.println("Searching for " + keyToSearch + " using hash method.");

		int foundAtIndex = hashRoutine(keyToSearch);
		System.out.println("Key " + keyToSearch + " is found at index " + foundAtIndex);
		System.out.println(" after 1 read.");

		return foundAtIndex;
	}

	// division method search
	public int hashDivision(String keyToSearch) { // Search method 4
		System.out.println("Searching for " + keyToSearch + " using hash division method.");

		int foundAtIndex = divideMethod(keyToSearch);
		System.out.println("Key " + keyToSearch + " is found at index " + foundAtIndex);
		System.out.println(" after 1 read.");

		return foundAtIndex;
	}

	public void displayRecordFromHashtable(int index) {
		System.out.println("Record = " + datahashed[index][0] + ", " + datahashed[index][1] + ", "
				+ datahashed[index][2] + ", " + datahashed[index][3]);

	}

	public void displayRecord(int index) {
		System.out.println(
				"Record = " + data[index][0] + ", " + data[index][1] + ", " + data[index][2] + ", " + data[index][3]);

	}

	public static void main(String[] args) {
		Search search = new Search();
		int rowItWasFounds = search.sequential("K9");
		search.displayRecord(rowItWasFounds);
		System.out.println();
		int rowItWasFoundb = search.binary("K9");
		search.displayRecord(rowItWasFoundb);
		System.out.println();

		// One-time preparation of records
		// Go to each record, hashed the key and store in new table (datahashed)
		for (int i = 0; i < search.data.length; i++) {
			int generatedHashIndex = search.hashRoutine(search.data[i][0]);
			search.datahashed[generatedHashIndex][0] = search.data[i][0];
			search.datahashed[generatedHashIndex][1] = search.data[i][1];
			search.datahashed[generatedHashIndex][2] = search.data[i][2];
			search.datahashed[generatedHashIndex][3] = search.data[i][3];
		}

		for (int i = 0; i < search.data.length; i++) {
			int generatedHashIndex1 = search.divideMethod(search.data[i][0]);
			search.datahashed[generatedHashIndex1][0] = search.data[i][0];
			search.datahashed[generatedHashIndex1][1] = search.data[i][1];
			search.datahashed[generatedHashIndex1][2] = search.data[i][2];
			search.datahashed[generatedHashIndex1][3] = search.data[i][3];
		}

		// Not searched the hashed table hash method
		int rowItWasFoundh = search.hash("K9");
		search.displayRecordFromHashtable(rowItWasFoundh);
		System.out.println();

		// Hash hash = new Hash(); incorrect search class

		// Prints out the generated addresses out of the keys
		for (int i = 0; i < search.data.length; i++) {
			System.out.println(search.divideMethod("K" + (new Integer(i)).toString()));

		}

		// Not searched the hashed table division method
		int rowItWasFounddm = search.hashDivision("K9");
		search.displayRecordFromHashtable(rowItWasFounddm);
		System.out.println();

	}

}

/*
 * 9.2 answers sequential search. 2 output is of each read, 3 10 reads, 4 worst
 * case scenario is, 5 best case scenario is, 6 what is the big-O? O(n) 6 why?
 * from the beginning to the end until the records key match with the key you
 * are searching for
 * 
 * 9.3 answers binary search. 2 output was only 4, 3 4 reads, 4 done, 5 worst
 * case scenario is, 6 best case scenario is, 7 infinite search, 8 -unknown,
 * big-O is O(lg n)
 * 
 * 9.4 answers hash search. 2 one record, 3 one read, 4 done, 5 worst case
 * scenario is, 6 best case scenario is, 7 Whats the big-O? O(1), 8 Calculates
 * the position of the key in the table based on the value of the key. When the
 * key is known, the position in the table can be accessed directly
 * 
 * 9.5 answers division method. 2 weird output, 3 1 read, 4 unknown
 * 
 */
