/**
 * @author Muhammad Rafdi
 * 
 * 24 February 2015
 * 
 * A class for the nodes in a tree
 * 
 */

package trees;

import java.util.ArrayList;

public class TreeNode {
	private int data;
	private ArrayList<TreeNode> children = new ArrayList<TreeNode>();
	private TreeNode parent;

	public TreeNode(int data, ArrayList<TreeNode> children, TreeNode parent) {
		this.data = data;
		this.children = children;
		this.parent = parent;
	}

	public TreeNode getParent() {
		return this.parent;
	}

	public void addChildren(TreeNode child) {
		this.children.add(child);
	}

	public ArrayList<TreeNode> getChildren() {
		return this.children;
	}

}
