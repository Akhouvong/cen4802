import java.util.Scanner;
public class Main {
	/**
	* Get input from the user of desired nth term of the Fibonacci sequence and then desplays desired nth term of the Fibonacci sequence.
	*
	*@author Alex Khouvongsavanh
	*/
	public static void main(String[] args) {
		long n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter nth term of the Fibonacci sequence: ");
		n = input.nextLong();
		System.out.println("The nth term of the fibonacci sequence is: " + fib(n));
	}
	
	/**
	*calculates the desired nth term of the fibonacci sequence, given the data provided.
	*
	* @param fib 
	*@return nth term of the fibonacci sequence
	*/
	public static long fib(long n) {
	      if ((n == 0) || (n == 1))
	    	  return n;
	      else
	    	  return fib(n - 1) + fib(n - 2);
	}

}
