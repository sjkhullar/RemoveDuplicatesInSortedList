package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.RemoveDuplicates;

public class App {
	public static void main(String[] args) {
		int[] listData = { 1, 2, 2, 3, 3, 9 };
		Node head = new Node(listData[0]);
		for (int count = 1; count < listData.length; count++)
			RemoveDuplicates.insert(head, listData[count]);

		System.out.printf("Linked list is : ");
		RemoveDuplicates.print(head);

		RemoveDuplicates.removeDuplicates(head);
		System.out.printf("Linked list after removing duplicates : ");
		RemoveDuplicates.print(head);
	}
}
