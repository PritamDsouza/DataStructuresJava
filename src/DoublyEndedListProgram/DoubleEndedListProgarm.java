package DoublyEndedListProgram;

public class DoubleEndedListProgarm {
	public static void main(String args[]) {
		DoublyEndedList dList = new DoublyEndedList();
		dList.insertAtTail(19);
		dList.insertAtTail(18);
		dList.insertAtHead(17);
		
		System.out.println(dList);
	}
}
