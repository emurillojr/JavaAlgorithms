package recursionhw;
/*
1 11 21 1211 111221 312211 13112221 1113213211 31131211131221 13211311123113112211
I see one
I see two 1
I see one 2,  one 1
I see one 1, one 2, two 1
I see three 1, two 2, one 1
I see one 3, one 1, two 2, two 1
I see one 1, one 3, two 1, three 2, one 1
I see three 1, one 3, one 2, one 1, one 3, one 2, two 1
I see one 3, two 1, one 3, one 1, one 2, three 1, one 3, one 1, two 2, one 1
I see one 1, one 3, one 2, two 1, one 3, three 1, one 2, one 3, two 1, one 3, two 1, two 2, two 1
next is 
11131221133112132113212221
next is
3113112221232112111312211312113211
*/

public class LookAndSay {

	public static void main(String[] args) {
		//String num = "1";
		int yourNumber = 5;
		
		lookAndSay(yourNumber);

	}
	
	
    public static String lookAndSay(int n) {
        String lookAndSayString = "1";
        for (int i = 1; i <= n; i++) {
            lookAndSayString = lookAndSayRec(lookAndSayString);
            System.out.println(i + " " + lookAndSayString);
        }
        return lookAndSayString;
    }
	
	
	

	public static String lookAndSayRec(String num) {
		StringBuilder sb = new StringBuilder();
		char first = num.charAt(0);  				// 1
		int count = 1; 								// 1
		if (num.length() == 1) {					// true
			sb.append(count);
			sb.append(first);
			return sb.toString();  					// 1
		}
		for (int i = 1; i < num.length(); i++) {
			if (first == num.charAt(i)) {
				count++;
			} else {
				sb.append(count);
				sb.append(first);
				first = num.charAt(i);
				count = 1;
			}
			if (i == num.length() - 1) {
				sb.append(count);
				sb.append(first);
			}
		}
		return sb.toString();
	}
}

// The characters of the String argument are appended, in order, increasing the length of this sequence by the length of the argument.
