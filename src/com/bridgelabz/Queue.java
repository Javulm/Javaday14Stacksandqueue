package com.bridgelabz;

public class Queue {
	private Node front, rear;
	private int currentSize;
	private class Node {
		int data;
		Node next;
	}
	public Queue() {
		front = null;
		rear = null;
		currentSize = 0;
	}

}
