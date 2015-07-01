/* 
 * Zach Schulze
 * 7/27/2014
 * 
 * Project Euler
 * Problem 6
 * Sum Square Difference
 *
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the fist one hundred
 * natural numbers and the square of the sum.
 */

public class p006 {
	public static void main(String[] args)
	{
		int difference, sumOfSquares, squareOfSum = 0;
		sumOfSquares = sumOfSquares(100);
		squareOfSum = squareOfSum(100);
		difference = squareOfSum - sumOfSquares;
		System.out.println(squareOfSum + " - " + sumOfSquares + " = " + 
				difference);
	}
	
	public static int sumOfSquares(int x)
	{
		int sumOfSquares = 0;
		for (int i = 1; i <= x; i++)
		{
			sumOfSquares += i * i;
		}
		return sumOfSquares;
	}
	
	public static int squareOfSum(int x)
	{
		int squareOfSum = 0;
		int sum = 0;
		for (int i = 1; i <= x; i++)
		{
			sum += i;
		}
		squareOfSum = sum * sum;
		return squareOfSum;
	}
}
