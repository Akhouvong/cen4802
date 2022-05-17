import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter nth term of the Fibonacci sequence: ");
		n = input.nextInt();
		System.out.println("The nth term of the fibonacci sequence is: " + fib(n));
	}
	
	public static int fib(int n) {
	      if ((n == 0) || (n == 1))
	    	  return n;
	      else
	    	  return fib(n - 1) + fib(n - 2);
	}

}
