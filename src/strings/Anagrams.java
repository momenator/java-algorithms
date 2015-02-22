/**
 * @author Muhammad Rafdi
 *
 * 22 February 2015
 * 
 * Time Complexity - O(N)
 * Space Complexity - O(256)
 */

package strings;

public class Anagrams {

	public static boolean solve(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		int[] charCount = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			charCount[str1.charAt(i)]++;
			charCount[str2.charAt(i)]--;
		}

		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(solve("abi", "iba"));
		System.out.println(solve("aligator", "gator"));
		System.out.println(solve("random", "stuff"));

	}

}
