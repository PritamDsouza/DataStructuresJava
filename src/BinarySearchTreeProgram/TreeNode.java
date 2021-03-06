package BinarySearchTreeProgram;

public class TreeNode {
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private boolean isDeleted = false;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public int smallest() {
		if(this.leftChild == null) {
			return this.data;
		}
		else {
			return this.leftChild.smallest();
		}
	}
	
	public int largest() {
		if(this.rightChild == null) {
			return this.data;
		}
		else {
			return this.rightChild.largest();
		}
	}
	
	public TreeNode find(int data) {
		if(this.data == data && !isDeleted) {
			return this;
		}	
		if(data < this.data && leftChild != null) {
			return leftChild.find(data);
		}
		if(rightChild != null) {
			return rightChild.find(data);
		}
		return null;
	}
	
	public void insert(int data) {
		if(data >= this.data) {
			if(this.rightChild == null) {
				this.rightChild = new TreeNode(data);
			}
			else {
				this.rightChild.insert(data);
			}
		}
		else {
			if(leftChild == null) {
				this.leftChild = new TreeNode(data);
			}
			else {
				this.leftChild.insert(data);
			}
		}
	}
	
	public void delete() {
		this.isDeleted = true;
	}
	
	public boolean isDeleted() {
		return isDeleted;
	}
	
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	public int getData() {
		return data;
	}
	
	
}
