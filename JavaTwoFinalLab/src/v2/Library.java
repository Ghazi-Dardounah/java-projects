package v2;

public class Library {
	private String name;
	private Borrowable[] items;
	private int count;

	public Library(String name, int size) throws IllegalArgumentException {
		if (size <= 0)
			throw new IllegalArgumentException("Invalid size: " + size);
		this.name = name;
		items = new Borrowable[size];
		count = 0;
	}

	public boolean add(Borrowable b) {
		for (int i = 0; i < count; i++) {
			if (((LibraryItem) items[i]).equals((LibraryItem) b))
				return false;
		}
		if (count < items.length) {
			if (b instanceof Book) {
				items[count++] = (Book) b;
				return true;
			}
			if (b instanceof Magazine) {
				items[count++] = (Magazine) b;
				return true;
			}
		}
		return false;
	}

	public boolean remove(Borrowable b) {
		for (int i = 0; i < count; i++) {
			if (((LibraryItem) items[i]).equals((LibraryItem) b)) {
				for (int j = i; j < count - 1; j++) {
					items[j] = items[j + 1];
				}
				items[count - 1] = null;
				count--;
				return true;
			}
		}
		return false;
	}

	public Borrowable getAt(int i) {
		if (i < 0 || i >= count)
			return null;
		return items[i];
	}

	public void borrowAll() {
		for (int i = 0; i < count; i++) {
			items[i].borrow();
		}
	}

	public Borrowable getMostOverdue() {
		if (count == 0)
			return null;
		return getMostOverdueHelper(0);
	}

	public Borrowable getMostOverdueHelper(int i) {
		if (i == count - 1)
			return items[i];
		Borrowable most = getMostOverdueHelper(i + 1);
		if (items[i].getDueDays() > most.getDueDays())
			return items[i];
		return most;
	}

	public String toString() {
		String s = name + " Library " + "(" + count + "):"+"\n";
		for (int i = 0; i < count; i++) {
			if (items[i] instanceof Book) {
				s += ((Book) items[i]).toString() + "\n";
			}
			if (items[i] instanceof Magazine) {
				s += ((Magazine) items[i]).toString() + "\n";
			}
		}
		return s;
	}

}
