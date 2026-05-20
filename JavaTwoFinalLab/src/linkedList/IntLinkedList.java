package linkedList;

public class IntLinkedList {
	private IntNode head;
	private IntNode tail;
	private String name;

	public IntLinkedList(String name) {
		head = tail = null;
		this.name = name;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insertAtBack(int data) {
		if (isEmpty())
			head = tail = new IntNode(data);
		else {
			IntNode newNode = new IntNode(data);
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void diplay() {
		if (isEmpty())
			System.out.println("The List " + name + " is Empty!");
		else {
			IntNode current = head;
			while(current != null) {
				System.out.println(current.getData());
				current = current.getNext();
			}
		}
	}
	
	public boolean search(int val) {
		IntNode current = head;
		while(current != null) {
			if(current.getData() == val)
				return true;
			current = current.getNext();
		}
		return false;
	}

}
