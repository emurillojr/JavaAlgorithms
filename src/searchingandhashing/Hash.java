package searchingandhashing;

public class Hash {

	public int simple(String key) {
		System.out.println("The key is = " + key);
		int len = key.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			int decVal = key.charAt(i);
			sum = sum + decVal;
			System.out.println("Character " + (char) key.charAt(i) + " = " + decVal);
		}
		return sum;
	}

	public static void main(String[] args) {
		Hash hash = new Hash();
		//int index = hash.simple("1007");
		int index = hash.simple("John Doe");
		System.out.println("Index number generated from key = " + index);

	}

}
// 2 index generated 200 for 1007
// 3 changed
// 4 index generated 711 for John Doe
// 5 adds all the hash code numbers generated for each element character
// 6 observation
//
// it always returns a number for an object.
// two equal objects will always have the same number
// two unequal objects not always have different numbers

