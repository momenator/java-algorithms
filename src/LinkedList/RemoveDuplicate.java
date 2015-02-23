/**
 * @author muhammad Rafdi
 * 
 * 22 February 2015 
 * 
 * A function to remove duplicate node in singly linked list
 * 
 * Time complexity - O(N)
 * Space complexity - O(N)
 */

package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public void solve(Node head) {
		Set<Node> seen = new HashSet<Node>();
		Node current = head;
		Node prev = null;
		while (current.getNext() != null) {
			if (seen.contains(current)) {
				prev.setNext(current.getNext());
				current.setNext(null);
			} else {
				seen.add(current);
				prev = current;
				current = current.getNext();
			}
		}
	}
}
