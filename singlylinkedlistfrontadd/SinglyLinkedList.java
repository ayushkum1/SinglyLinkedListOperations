package com.app.singlylinkedlistfrontadd;

public class SinglyLinkedList {

	private ListNode head;

	public SinglyLinkedList() {
		head = null;
	}

	public class ListNode {
		int data;
		ListNode next;
	}

	/*
	 * a) Add a number at the front of list. void addAtFront(int no)
	 */
	public void addAtFront(int num) {
		ListNode newNode = new ListNode();
		
		newNode.data = num;
		newNode.next = head;
		head = newNode;
	}

	/*
	 * b) Print all elements stored in the list.
	 */
	public void printList() {

		ListNode currentNode = head;

		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

	/*
	 * c) Count number of elements/nodes of the list. The function should return the
	 * count. int count()
	 */
	public int countNodes() {
		int count = 0;
		ListNode currentNode = head;

		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}

	/*
	 * d) Count frequency of a element in the list. The function should return the
	 * frequency. int countFrequency(int no)
	 */
	public int countFrequency(int num) {
		int freq = 0;

		ListNode currentNode = head;

		while (currentNode != null) {
			if (currentNode.data == num) {
				freq++;
			}
			currentNode = currentNode.next;
		}

		return freq;
	}

	/*
	 * e) Check if a given number is present in the list or not. Function should
	 * return true if number is present, false otherwise.
	 */
	public boolean find(int num) {

		ListNode currentNode = head;
		boolean exist = false;

		while (currentNode != null) {
			if (currentNode.data == num) {
				exist = true;// in case i want to check the frequency of the given number if present
								// then return true from here will return the very first time element is found,
								// hence returning it outside the while
			}
			currentNode = currentNode.next;
		}

		return exist;
	}

}
