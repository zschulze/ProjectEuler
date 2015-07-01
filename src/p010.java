/* 
 * Zach Schulze
 * 11/12/2014
 * 
 * Project Euler
 * Problem 10
 * Summation of primes
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */

public class p010 {
	public static void main (String[] args) {
		final long limit = 2000000;
		long sum = 0;
		for (int i = 2; i < limit; i++) {
			if (isPrime(i)) sum += i;
		}
		System.out.println(sum);
	}
	
	public static boolean isPrime(int x) {
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
