package linkedList3;

public class GenericLinkedList<T> {
	private GenericNode<T> head;
	private GenericNode<T> tail;
	private String name;

	public GenericLinkedList(String name) {
		this.name = name;
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public boolean insertAtBack(T data) {
		if (isEmpty()) {
			head = tail = new GenericNode<T>(data);
			return true;
		} else {
			GenericNode<T> newNode = new GenericNode<>(data);
			tail.setNext(newNode);
			tail = newNode;
			return true;
		}
	}

	public void diplay() {
		if (isEmpty()) {
			System.out.println("List is Empty!");
			return;
		}
		GenericNode<T> current = head;
		while (current != null) {
			System.out.println("The list " + name + " contains: ");
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

	public boolean contains(T item) {
		if (isEmpty())
			return false;
		GenericNode<T> current = head;
		while (current != null) {
			if (current.getData().equals(item)) {
				return true;
			} else {
				current = current.getNext();
			}
		}
		return false;
	}

	public int size() {
		if (isEmpty())
			return 0;
		int count = 1;
		GenericNode<T> current = head;
		while (current.getNext() != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

}
