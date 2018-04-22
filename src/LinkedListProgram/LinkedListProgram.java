package LinkedListProgram;

public class LinkedListProgram {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insertAtStart(25);
		list.insertAt(0, 55);
		list.deleteAt(2);
		list.show();
		System.out.println("Length: " + list.length());
		list.deleteAtStart();
		list.show();
		System.out.println(list.find(25).data + " found");
	}

}

