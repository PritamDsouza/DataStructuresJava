package DoublyLinkedListProgram;

public class DoublyLinkedList{
	private DoublyLinkedNode head;
	
	public void insertAtHead(int data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		newNode.setNextNode(head);
		if(head != null) {
			head.setPrevNode(newNode);
		}
		head = newNode;
	}
	
	public void insertAtTail(int data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		DoublyLinkedNode current = head;
		
		while(current.getNextNode() != null) {
			current = current.getNextNode();
		}
		current.setNextNode(newNode);
	}
	
	@Override
	public String toString() {
		String result = "{";
		DoublyLinkedNode current = head;
		
		while(current != null) {
			result += current.getData() + ", ";
			current = current.getNextNode();
		}
		result += "}";
		return result;
	}
}
