package recursionhw;

/*
Your objective is to complete a recursive function reverse() 
that receives str as String and returns the same string in 
reverse order
Rules:
reverse function should be executed only N times. 
N = length of the input string
helper functions are not allowed
changing the signature of the function is not allowed
Examples:
reverse("hello world") = "dlrow olleh" (N = 11)
reverse("abcd") = "dcba" (N = 4)
reverse("12345") = "54321" (N = 5)
*/
public class ReverseString {

	public static void main(String[] args) {
		// reverse("hello World");
		// reverse("abcd");
		// reverse("12345");
		System.out.println(reverse("hello World"));
		// System.out.println();
		System.out.println(reverse("abcd"));
		// System.out.println();
		System.out.println(reverse("12345"));
		// System.out.println();

	}

	public static String reverse(String str) {
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	    //str = reverse(str.substring(1)) + str.charAt(0);
	    //System.out.println(str);  to see whats happening at every iteration 
	    //return str;
	}

}
/*
reverse("Hello")
(reverse("ello")) + "H"
((reverse("llo")) + "e") + "H"
(((reverse("lo")) + "l") + "e") + "H"
((((reverse("o")) + "l") + "l") + "e") + "H"
(((("o") + "l") + "l") + "e") + "H"
"olleH"
*/


