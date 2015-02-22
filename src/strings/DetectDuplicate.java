/**
 * @author Muhammad Rafdi
 * 
 * 22 February 2015
 *
 * Time Complexity - O(N)
 * Space Complexity - O(N)
 */
package strings;

import java.util.HashSet;
import java.util.Set;

public class DetectDuplicate {

	public static boolean solve(String str) {

		Set<Character> seen = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			if (seen.contains(str.charAt(i))) {
				return false;
			}
			seen.add(str.charAt(i));
		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println(solve("asdfghjkl"));

		System.out.println(solve("aabbccss"));

	}

}
