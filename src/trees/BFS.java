/**
 * @author Muhammad Rafdi
 * 
 * 22 February 2015
 * 
 * Tree non-recursive BFS
 * 
 * Time Complexity - O(V)
 * Space Complexity - O(2V)
 */
package trees;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {

	public TreeNode solve(TreeNode root, int target) {
		Set<TreeNode> seen = new HashSet<TreeNode>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode current = root;
		queue.add(current);
		while (!queue.isEmpty()) {
			current = queue.remove();
			if (current.getData() == target) {
				return current;
			}
			for (TreeNode n : current.getChildren()) {
				if (!seen.contains(n)) {
					queue.add(n);
					seen.add(n);
				}
			}

		}
		return null;
	}
}
