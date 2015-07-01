/* 
 * Zach Schulze
 * 7/25/2014
 * 
 * Project Euler
 * Problem 5
 * Smallest Multiple
 *
 * 2520 is the smallest number that can be divided by each of the number from
 * 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */

public class p005 {
	public static void main(String[] args)
	{
		System.out.println(smallestMultiple());
	}
	
	public static int smallestMultiple()
	{
		boolean answer = true;
		int x = 2520;
		while (true)
		{	
			for (int i = 1; i <= 20; i++)
			{
				System.out.println(x + " - " + i);
				if (x % i != 0)
				{
					x = x + 2520;    // add 2520 because answer must be a
					answer = false;  // multiple of 2520
					break;
				}
				answer = true;
			}
			if (answer == true)
			{
				return x;
			}
		}
	}
}
