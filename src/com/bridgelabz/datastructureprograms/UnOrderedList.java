package com.bridgelabz.datastructureprograms;

public class UnOrderedList<K> {

	public INode head;
	public INode tail;

	public UnOrderedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode node) {
		if (this.head == null) {
			this.head = node;
		}
		if (this.tail == null) {
			this.tail = node;
		} else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}

	public void pop(INode node) {
		if (this.head == null) {
			System.out.println("List is empty.");
		} else {
			if (this.head == node) {
				if (this.tail == this.head) {
					this.head = null;
					this.tail = null;
				} else {
					this.head = this.head.getNext();
				}
				System.out.println("run");
			} else if (this.tail == node) {
				INode tempNode = this.head;
				while (tempNode.getNext().getNext() != null) {
					tempNode = tempNode.getNext();
				}
				tempNode.setNext(null);
				this.tail = tempNode;
				System.out.println("run");
			} else {
				INode tempNode = this.head;
				while (tempNode.getNext() == node) {
					tempNode = tempNode.getNext();
				}
				tempNode.setNext(tempNode.getNext().getNext());
			}
		}
	}

	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = this.head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

}
