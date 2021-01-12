package com.app.singlylinkedlist;

import java.util.Scanner;

/*
	PLS ADD INTERFACE
*/
public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		
		System.out.println("*************adding at front*************");
		singlyLinkedList.addAtFront(10);
		singlyLinkedList.addAtFront(9);
		singlyLinkedList.addAtFront(6);
		singlyLinkedList.addAtFront(7);
		singlyLinkedList.addAtFront(6);
		
		System.out.println("*************adding at back*************");
		singlyLinkedList.addAtEnd(22);
		singlyLinkedList.addAtEnd(23);
		singlyLinkedList.addAtEnd(24);
		singlyLinkedList.addAtEnd(25);
		
		System.out.println("*************printing*************");
		singlyLinkedList.printList();
		
//		System.out.println("*************counting*************");
//		System.out.println(singlyLinkedList.countNodes());
//
//		System.out.println("*************frequency*************");
//		System.out.println("Enter the number");
//		System.out.println(singlyLinkedList.countFrequency(sc.nextInt()));
//		
//		System.out.println("*************find*************");
//		System.out.println("Enter the number");
//		System.out.println(singlyLinkedList.find(sc.nextInt()));
	}
	
}
