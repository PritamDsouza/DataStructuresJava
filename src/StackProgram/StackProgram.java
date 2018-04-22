package StackProgram;

public class StackProgram {

	public static void main(String[] args) {
		Stack nums = new Stack();
		System.out.println("is Empty? " + nums.isEmpty());
		nums.push(15);
		nums.push(8);
		nums.push(10);
		nums.show();
		System.out.println("Pop " + nums.pop());
		nums.show();
		System.out.println("Peek " + nums.peek());
		System.out.println(nums.size());
		System.out.println("is Empty? " + nums.isEmpty());
		System.out.println("Pop " + nums.pop());
		System.out.println("Pop " + nums.pop());
	}

}
