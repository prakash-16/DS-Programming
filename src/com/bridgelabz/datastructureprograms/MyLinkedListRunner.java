package com.bridgelabz.datastructureprograms;

import java.util.*;
import java.util.Arrays;

public class MyLinkedListRunner {

	public static void main(String[] args) {
		int i;
		int[] arr = new int[]{41,2,85,6,87,91,74};
		int max = arr[0];
		Scanner sc = new Scanner(System.in);
		Arrays.sort(arr);
		OrderedList myLinkedList = new OrderedList();
		for (i = 0; i< arr.length; i++) {
			MyNode<Integer> newNode = new MyNode<Integer>(arr[i]);
			myLinkedList.add(newNode);
		}
		myLinkedList.printNodes();
		System.out.println("Enter a number :- ");
		int input = sc.nextInt();
		MyNode<Integer> node = new MyNode<Integer>(input);
		for (i = 0; i< arr.length; i++) {
			if (arr[i] == input) {
				myLinkedList.pop(node);
			} else {
				myLinkedList.add(node);
			}
		}
		myLinkedList.printNodes();

	}

}
