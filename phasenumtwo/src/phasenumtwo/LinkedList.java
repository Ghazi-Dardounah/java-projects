package phasenumtwo;

import java.util.Iterator;
import java.util.function.Predicate;

public class LinkedList<T> implements Iterable<T> {
	private Node<T> head;
	private int size;

	public LinkedList() {
		head = null;
		size = 0;
	}

	public void add(T item) {
		Node<T> newNode = new Node<T>(item);

		if (head == null) {
			head = newNode;
		} else {
			Node<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		size++;
	}

	public boolean remove(T item) {
		if (head == null) {
			return false;
		}

		if (head.data.equals(item)) {
			head = head.next;
			size--;
			return true;
		}

		Node<T> current = head;
		while (current.next != null) {
			if (current.next.data.equals(item)) {
				current.next = current.next.next;
				size--;
				return true;
			}
			current = current.next;
		}

		return false;
	}

	public T get(int index) {
		if (index < 0 || index >= size) {
			return null;
		}

		Node<T> current = head;
		int count = 0;

		while (current != null) {
			if (count == index) {
				return current.data;
			}
			count++;
			current = current.next;
		}

		return null;
	}

	public T search(Predicate<T> condition) {
		Node<T> current = head;

		while (current != null) {
			if (condition.test(current.data)) {
				return current.data;
			}
			current = current.next;
		}

		return null;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Node<T> getHead() {
		return head;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator<T>(head);
	}
}
