package com.app.singlylinkedlistendadd;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		
		System.out.println("*************adding at back*************");
		singlyLinkedList.addAtEnd(22);
		singlyLinkedList.addAtEnd(23);
		singlyLinkedList.addAtEnd(24);
		singlyLinkedList.addAtEnd(25);
		
		System.out.println("*************printing*************");
		singlyLinkedList.printList();
		
	}
	
}
