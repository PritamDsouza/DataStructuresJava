package LinkedListProgram;

public class LinkedList {
	Node head;
	
	public int length() {
		int length = 0;
		Node current = head;
		while(current != null) {
			length++;
			current = current.next;
		}
		return length;
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}
	
	public Node find(int data) {
		Node current = head;
		while(current != null) {
			if(current.data == data) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
	
	public void insertAtStart(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index, int data) {
		Node node = new Node(data);
		node.next = null;
		
		if(index == 0) {
			insertAtStart(data);
		}
		else {
			Node current = head;
			for(int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			node.next = current.next;
			current.next = node;
		}
	}
	
	public void deleteAtStart() {
		head = head.next;
	}
	
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}
		else {
			Node current = head;
			Node currentNext = null;
			for(int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			currentNext = current.next;
			current.next = currentNext.next;
			currentNext = null;
		}
	}
	
	public void show() {
		Node current = head;
		while(current != null) {
			System.out.print(" " + current.data);
			current = current.next;
		}
		System.out.println();
	}
}