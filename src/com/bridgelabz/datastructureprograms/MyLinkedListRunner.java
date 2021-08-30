package com.bridgelabz.datastructureprograms;

import java.util.*;

public class MyLinkedListRunner {

	public static void main(String[] args) {
		String sentence = "to be or not to be at the place";
		Scanner sc = new Scanner(System.in);
		String[] words = sentence.toLowerCase().split(" ");
		UnOrderedList myLinkedList = new UnOrderedList();
		for (String word : words) {
			MyNode<String> newNode = new MyNode<String>(word);
			myLinkedList.add(newNode);
		}
		myLinkedList.printNodes();
		System.out.println("Enter a word :- ");
		String input = sc.nextLine();
		MyNode<String> node = new MyNode<String>(input);
		for (String word : words) {
			if (word.equals(input)) {
				myLinkedList.pop(node);
			} else {
				myLinkedList.add(node);
			}
		}
		myLinkedList.printNodes();

	}

}
