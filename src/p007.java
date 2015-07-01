/* 
 * Zach Schulze
 * 7/28/2014
 * 
 * Project Euler
 * Problem 7
 * 10001st Prime
 *
 * By listing the first six prime numbers: 2,3,5,7,11,13, we can see that the
 * 6th prime is 13.
 * 
 * What is the 10,001st prime number?
 */

public class p007 {
	public static void main(String[] args)
	{
		long startTime = System.nanoTime();
		int x = 2;
		int numOfPrimes = 0;
		int currentPrime = 0;
		while (true)
		{
			if (numOfPrimes != 10001)
			{
				if (isPrime(x)== true)
				{
					numOfPrimes++;
					currentPrime = x;
					x++;
					System.out.println("#" + numOfPrimes + " - " +
							currentPrime);
				}
				else x++;
			}
			else break;
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("Time to compute: " + duration / 100000 + "ms");
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
