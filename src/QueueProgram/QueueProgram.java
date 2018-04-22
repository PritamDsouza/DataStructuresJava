package QueueProgram;

public class QueueProgram {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);
		q.show();
		System.out.println("removed: " + q.deQueue());;
		q.show();
		System.out.println("removed: " + q.deQueue());;
		q.show();
		q.enQueue(9);
		q.enQueue(1);
		System.out.println("Size: " + q.getSize());
		System.out.println("Size: " + q.isEmpty());
		q.show();
		q.enQueue(19);
		q.enQueue(15);
		q.show();
		

	}
}
