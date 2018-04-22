package DoublyLinkedListProgram;

public class DoublyLinkedListProgram {
	public static void main(String args[]) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtHead(15);
		list.insertAtHead(13);
		list.insertAtHead(18);
		list.insertAtHead(19);
		list.insertAtHead(11);
		list.insertAtTail(20);
		System.out.println(list.toString());
	}
}