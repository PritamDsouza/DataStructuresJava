package DoublyEndedListProgram;

public class DoublyEndedList{
	private Node head;
	private Node tail;
	
	public void insertAtHead(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
		}
		else{
			node.next = head;
			head = node;
		}
	}
	
	public void insertAtTail(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
		}
		else{
			tail.next = node;
			tail = node;
		}
	}
	
	@Override
	public String toString() {
		String result = "{";
		Node current = head;
		
		while(current != null) {
			result += current.data + " ";
			current = current.next;
		}
		result += "}";
		return result;
	}
}