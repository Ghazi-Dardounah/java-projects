package phasenumtwo;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListIterator<T> implements Iterator<T> {
	private Node<T> current;

	public LinkedListIterator(Node<T> head) {
		current = head;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public T next() {
		if (current == null) {
			throw new NoSuchElementException();
		}

		T item = current.data;
		current = current.next;
		return item;
	}
}
