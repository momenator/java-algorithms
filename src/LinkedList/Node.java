/**
 * @author muhammad Rafdi
 * 
 * 22 February 2015 
 * 
 * Class for node in linked list
 * 
 */

package LinkedList;

public class Node {
	private Node next;
	private Node head;
	private int data;

	public Node(Node next, int data) {
		this.next = next;
		this.data = data;
	}

	public Node getHead() {
		return this.head;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
