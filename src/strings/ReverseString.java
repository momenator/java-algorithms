/**
 * @author muhammad Rafdi
 * 
 * 22 February 2015 
 * 
 * A function to reverse character array
 * 
 * Time complexity - O(N)
 * Memory complexity - O(1)
 */
package strings;

public class ReverseString {

	public static char[] solveWithoutBuffer(char[] s) {
		int len = s.length;
		for (int i = 0; i < len / 2; i++) {
			char tmp = s[i];
			s[i] = s[len - i - 1];
			s[len - i - 1] = tmp;
		}
		return s;
	}

	public static void main(String[] args) {
		String s = "camel";
		char[] charArr = solveWithoutBuffer(s.toCharArray());

		for (char c : charArr) {
			System.out.print(c);
		}
	}
}
