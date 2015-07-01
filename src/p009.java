/* 
 * Zach Schulze
 * 11/12/2014
 * 
 * Project Euler
 * Problem 9
 * Special Pythagorean triplet
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a^2 + b^2 = c^2.
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * 
 * Find the product abc.
 */

public class p009 {
	public static void main(String[] args) {
		System.out.println(pyTriplet());
	}
	
	public static int pyTriplet () {
		int sum;
		int leftSide;
		int rightSide;
		
		for (int i = 1; i < 1000; i ++) {
			for (int j = 1; j < 1000; j++) {
				for (int k = 1; k < 1000; k++) {
					sum = i + j + k;
					if (sum == 1000) {
						leftSide = i*i + j*j;
						rightSide = k*k;
						if (leftSide == rightSide) {
							System.out.println(i + "^2 + " + j + "^2 = " +
									k + "^2");
							System.out.println(leftSide + " = " + rightSide);
							return i*j*k;
						}
					}
				}
			}
		}
		return 0;
	}
}
