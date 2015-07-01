/* 
 * Zach Schulze
 * 7/25/2014
 * 
 * Project Euler
 * Problem 4
 * Largest Palindrome Product
 *
 * A palindromic number reads the same both ways. The largest palindrome made
 * made from the product of two 2-digit numbers is 9009 = 91 x 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class p004 {
	public static void main(String[] args)
	{
		int xValue = 0;
		int yValue = 0;
		int intSum = 0;
		int largestPalindrome = 0;
		
		for (int i = 100; i < 1000; i++)
		{
			for (int j = 100; j < 1000; j++)
			{
				intSum = i * j;
				String strSum = Integer.toString(intSum);
				char[] arraySum = strSum.toCharArray();
				if (isPalindrome(arraySum))
				
				{
					System.out.println(i + " x " + j + " = " + intSum);
					if (largestPalindrome < intSum)
					{
						largestPalindrome = intSum;
						xValue = i;
						yValue = j;
					}
				}
			}
		}
		System.out.println("Largest palindrome: " + xValue + " * " + yValue
				+ " = " + largestPalindrome);
	}
	
	public static boolean isPalindrome(char[] arraySum)
	{
		int x = 0;
		int y = arraySum.length - 1;
		while (y > x)
		{
			if (arraySum[x] != arraySum[y])
			{
				return false;
			}
			x++;
			y--;
		}
		return true;
	}
}
