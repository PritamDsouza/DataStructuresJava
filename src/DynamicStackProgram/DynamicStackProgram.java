package DynamicStackProgram;

public class DynamicStackProgram {

	public static void main(String args[]) {
		DynamicStack dNum = new DynamicStack();
		dNum.push(12);
		dNum.show();
		dNum.push(13);
		dNum.show();
		dNum.push(14);
		dNum.show();
		dNum.push(12);
		dNum.show();
		dNum.push(12);
		dNum.show();
		dNum.pop();
		dNum.show();
		dNum.pop();
		dNum.show();
		dNum.pop();
		dNum.show();
		dNum.pop();
		dNum.show();
	}
}
