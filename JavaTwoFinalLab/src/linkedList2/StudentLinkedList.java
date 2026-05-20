package linkedList2;

public class StudentLinkedList {
	private StudentNode head;
	private StudentNode tail;
	private String name;

	public StudentLinkedList(String name) {
		this.name = name;
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insertAtFront(Student data) {
		if (isEmpty())
			head = tail = new StudentNode(data);
		else {
			StudentNode newNode = new StudentNode(data);
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void insertAtBack(Student data) {
		if (isEmpty())
			head = tail = new StudentNode(data);
		else {
			StudentNode newNode = new StudentNode(data);
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public Student removeFromFront() {
		if (isEmpty())
			return null;
		StudentNode firstNode = head;
		if (firstNode.getNext() == null)
			head = tail = null;
		else
			head = head.getNext();
		return firstNode.getData();
	}

	public Student removeFromBack() {
		if (isEmpty())
			return null;
		StudentNode current = head;
		if (current.getNext() == null) {
			head = tail = null;
			return current.getData();
		}
		StudentNode previous = null;
		while (current.getNext() != null) {
			previous = current;
			current = current.getNext();
		}
		previous.setNext(null);
		tail = previous;
		return current.getData();
	}

	public boolean removeById(int id) {
		if (isEmpty())
			return false;
		if (head.getData().getId() == id) {
			if (head == tail)
				head = tail = null;
			else
				head = head.getNext();
			return true;
		}
		StudentNode current = head.getNext();
		StudentNode previous = head;
		while (current != null) {
			if (current.getData().getId() == id) {
				if (current == tail) {
					tail = previous;
				}
				previous.setNext(current.getNext());
				return true;
			} else {
				previous = current;
				current = current.getNext();
			}
		}
		return false;
	}
}
