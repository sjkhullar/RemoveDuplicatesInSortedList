package org.learn.Question;

import org.learn.List.Node;

public class RemoveDuplicates {

	public static void removeDuplicates(Node head) {
		// first node to be inserted
		if (null == head) {
			System.out.println("Linked list is empty");
			return;
		}
		Node nextNode = null;
		while (head.next != null) {
			// check for duplicates
			// E.g 1->2->2->3
			if (head.data == head.next.data) {
				nextNode = head.next.next;
				// deleting next node...
				// let gc take care of it
				head.next = null;
				head.next = nextNode;
			} else {
				// no duplicate..move to next node
				head = head.next;
			}
		}
	}

	public static void insert(Node head, int data) {
		while (head.next != null)
			head = head.next;
		head.next = new Node(data);
	}

	public static void print(Node head) {
		while (head != null) {
			System.out.printf("%d ", head.data);
			head = head.next;
		}
		System.out.println("");
	}
}
