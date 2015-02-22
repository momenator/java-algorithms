/**
 * @author Muhammad Rafdi
 *
 * 22 February 2015
 * 
 * Constant Memory nxn Integer Matrix 90 degree rotation
 * Time Complexity - O((N^2) approximately
 */
package arrays;

import java.util.Arrays;

public class MatrixRotation {

	public static int[][] solve(int[][] arr) {
		int len = arr.length;
		int tmp;

		for (int i = 0; i < len / 2; i++) {
			for (int j = i; j < len - i - 1; j++) {

				tmp = arr[i][j];
				// swap top right with top left
				arr[i][j] = arr[j][len - i - 1];
				// swap the top left with the bottom right
				arr[j][len - i - 1] = arr[len - i - 1][len - j - 1];
				// swap the bottom right with the bottom left
				arr[len - i - 1][len - j - 1] = arr[len - j - 1][i];
				// swap the top left with bottom left
				arr[len - j - 1][i] = tmp;

			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] in = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 },
				{ 1, 2, 3, 4 } };
		System.out.println("Before");
		for (int[] a : in) {
			System.out.println(Arrays.toString(a));
		}

		int[][] arr = solve(in);
		System.out.println("After");
		for (int[] b : arr) {
			System.out.println(Arrays.toString(b));
		}
	}
}
