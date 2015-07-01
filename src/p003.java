/* 
 * Zach Schulze
 * 7/24/2014
 * 
 * Project Euler
 * Problem 3
 * Largest Prime Factor
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */

import java.math.BigInteger;

public class p003 {
	public static void main(String[] args)
	{
		BigInteger testNumber = new BigInteger("600851475143");
		BigInteger currentFactor = new BigInteger("2");
		int largestPrime = 2;
		
		while (true)
		{
			while (testNumber.remainder(currentFactor).equals(BigInteger.ZERO))
			{
				testNumber = testNumber.divide(currentFactor);
				largestPrime = currentFactor.intValue();
				System.out.println("- " + largestPrime);
			}
			
			if (currentFactor.equals(BigInteger.valueOf(2)))
			{
				currentFactor = currentFactor.add(BigInteger.valueOf(1));
			}else
			{
				currentFactor = currentFactor.add(BigInteger.valueOf(2));
			}
			
			if (testNumber.equals(BigInteger.ONE))
			{
				break;
			}
		}
		
		System.out.println(largestPrime);
	}
}
