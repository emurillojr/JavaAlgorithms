package fibonacciseries;
import java.util.Scanner;

public class FibonacciOld {
	/* example of Fibonacci Series
	0   1   1   2   3   5   8   13  21  34  55  89
	a + b = c
	    a + b = c
	        a + b = c
	            a + b = c
	                a + b = c
	                    a + b = c
	                        a + b = c
so...
b=a;
c=b
	*/	

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a +" "); // 0
		System.out.print(b +" "); // 1

		while (c <= number){
			c=a+b;
				if(c >= number)
					break;
			System.out.print(c +" "); // 1, 2, 3, 8, ....
			a=b;
			b=c;
		}
	
	}

}
