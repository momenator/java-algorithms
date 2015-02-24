/**
 * By Muhammad Rafdi
 *
 * 24 Feb 2015
 * 
 * Recursive DFS without stack
 * 
 * Time Complexity - O(V)
 * Space Complexity - O(V)
 **/

package trees;

import java.util.HashSet;
import java.util.Set;

public class DFSRecursive {
	public void solve(TreeNode root, int target) {
		Set<TreeNode> seen = new HashSet<TreeNode>();
		solveUtil(root, seen);
	}

	public void solveUtil(TreeNode node, Set<TreeNode> seen) {
		System.out.println(node.getData());
		seen.add(node);
		for (TreeNode n : node.getChildren()) {
			if (!seen.contains(n)) {
				solveUtil(n, seen);
			}
		}
	}

}
