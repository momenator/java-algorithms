/**
 * @author Muhammad Rafdi
 * 
 * 22 February 2015
 * 
 * This is the algorithm to find the maximum sum of contiguous integers
 * in an array
 * 
 * Time Complexity - O(N)
 * Space Complexity - O(N)
 */
package arrays;

public class MaxSubArray {

	public static int solve(int[] arr) {
		int tmp = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			tmp = Math.max(arr[i], (tmp + arr[i]));
			max = Math.max(max, tmp);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, -55, 7 };
		System.out.println(solve(arr));

	}

}
