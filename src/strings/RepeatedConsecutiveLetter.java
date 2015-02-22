/**
 * @author muhammad Rafdi
 * 
 * 22 February 2015 
 * 
 * Write a function that takes in a string and an int. 
 * The int   determines the number of repeated consecutive 
 * letters you want to have returned. 
 * 
 * For example: (aab, 1) -> ab. (aaabba, 2) -> aabba 
 * 
 * Time complexity - O(N)
 * Space complexity - O(1) - if a string is returned, then 
 * it will be O(N). 
 */
package strings;

public class RepeatedConsecutiveLetter {

	public static void solve(String s, int n) {
		int currCount = 0;
		char currChar = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			if (currChar != s.charAt(i)) {
				currCount = 0;
				currChar = s.charAt(i);
			}

			if ((s.charAt(i) == currChar) && (currCount < n)) {
				currCount++;
				System.out.print(s.charAt(i));
			} else {
				continue;
			}

		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve("aab", 1);
		solve("aaabba", 2);
	}

}
