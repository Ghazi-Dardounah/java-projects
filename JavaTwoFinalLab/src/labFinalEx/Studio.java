package labFinalEx;

import java.util.*;

public class Studio {
	private String name;
	private Watchable[] films;
	private int count;

	public Studio(String name, int capacity) throws IllegalArgumentException {
		this.name = name;
		if (capacity <= 0) {
			throw new IllegalArgumentException("Invalid capacity: " + capacity);
		}
		films = new Watchable[capacity];
		count = 0;
	}
//
//	public boolean add(Watchable f) throws StudioException {
//		if (count < films.length) {
//			for (int i = 0; i < count; i++) {
//				if (films[i].equals(f)) {
//					return false;
//				}
//			}
//			if (f instanceof ActionFilm) {
//				ActionFilm ac1 = (ActionFilm) f;
//				films[count++] = new ActionFilm(ac1);
//				return true;
//			} else if (f instanceof ComedyFilm) {
//				ComedyFilm cm1 = (ComedyFilm) f;
//				films[count++] = new ComedyFilm(cm1);
//				return true;
//			}
//		}
//		return false;
//	}
//
//	public boolean addLast(Watchable f) throws StudioException {
//		if (f instanceof ActionFilm && count < films.length) {
//			films[count++] = new ActionFilm((ActionFilm) f);
//			return true;
//		} else if (f instanceof ComedyFilm && count < films.length) {
//			films[count++] = new ComedyFilm((ComedyFilm) f);
//			return true;
//		}
//		return false;
//	}
//
//	public boolean addFirst(Watchable f) throws StudioException {
//		for (int i = 0; i < count; i++) {
//			if (films[i].equals(f)) {
//				return false;
//			}
//		}
//		if (count < films.length) {
//			for (int i = count; i > 0; i--) {
//				films[i] = films[i - 1];
//			}
//			if (f instanceof ActionFilm) {
//				ActionFilm ac2 = (ActionFilm) f;
//				films[0] = new ActionFilm(ac2);
//				count++;
//				return true;
//			} else if (f instanceof ComedyFilm) {
//				films[0] = new ComedyFilm((ComedyFilm) f);
//				count++;
//				return true;
//			}
//		}
//		return false;
//	}
//
//	public boolean addAt(Watchable f, int pos) throws StudioException {
//		if (pos > count || pos < 0)
//			return false;
//		if (count < films.length) {
//			for (int i = count; i > pos; i--) {
//				films[i] = films[i - 1];
//			}
//			if (f instanceof ActionFilm) {
//				films[pos] = new ActionFilm((ActionFilm) f);
//				count++;
//				return true;
//			} else if (f instanceof ComedyFilm) {
//				films[pos] = new ComedyFilm((ComedyFilm) f);
//				count++;
//				return true;
//			}
//		}
//		return false;
//	}
//
//	public boolean remove(Watchable f) {
//		for (int i = 0; i < count - 1; i++) {
//			if (films[i].equals(f)) {
//				for (int j = i; j < count-1; j++) {
//					films[j] = films[j + 1];
//				}
//				count--;
//				return true;
//			}
//		}
//		return false;
//	}
//
//	public Watchable removeFirst() {
//		if (count == 0)
//			return null;
//		Watchable removed = films[0];
//		for (int i = 0; i < count - 1; i++) {
//			films[i] = films[i + 1];
//		}
//		count--;
//		return removed;
//	}
//
//	public Watchable removeLast() {
//		if (count == 0)
//			return null;
//		Watchable removed = films[count - 1];
//		films[count - 1] = null;
//		count--;
//		return removed;
//	}
//
//	public Watchable removeAt(Watchable f, int pos) {
//		if (pos >= count || pos < 0) {
//			return null;
//		}
//		Watchable removed = films[pos];
//		for (int i = pos; i < count - 1; i++) {
//			films[i] = films[i + 1];
//		}
//		count--;
//		films[count] = null;
//		return removed;
//	}
//
//	public Watchable getAt(int i) {
//		if (i < 0 || i >= count) {
//			return null;
//		}
//		return films[i];
//	}

	public void playAll() {
		for (int i = 0; i < count; i++) {
			films[i].play();
		}
	}

//	public Watchable getLongest() {
//		if(count == 0)
//			return null;
//		
//	}
	public ActionFilm[] getActionFilms() {
		int size = 0;
		int c = 0;
		for (int i = 0; i < count; i++) {
			if (films[i] instanceof ActionFilm) {
				size++;
			}
		}
		ActionFilm arr[] = new ActionFilm[size];
		for (int i = 0; i < count; i++) {
			if (films[i] instanceof ActionFilm)
				arr[c++] = (ActionFilm) films[i];
		}
		return arr;
	}

	public int getSize() {
		return count;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public String toString() {
		String s = name + " Studio (" + count + "/" + films.length + "):\n";
		for (int i = 0; i < count; i++) {
			s += films[i].toString() + "\n";
		}
		return s;
	}

	// ============ add/remove =============
	public boolean add(Watchable f) throws StudioException {
		for (int i = 0; i < count; i++)
			if (films[i] instanceof Film && f instanceof Film) {
				if (((Film) films[i]).equals((Film) f)) {
					return false;
				}
			}
		if (count < films.length) {
			if (f instanceof ActionFilm) {
				films[count++] = new ActionFilm((ActionFilm) f);
				return true;
			} else if (f instanceof ComedyFilm) {
				films[count++] = new ComedyFilm((ComedyFilm) f);
				return true;
			}
		}
		return false;
	}

	public boolean addLast(Watchable f) throws StudioException {
		if (count < films.length) {
			if (f instanceof ActionFilm) {
				films[count++] = new ActionFilm((ActionFilm) f);
				return true;
			} else if (f instanceof ComedyFilm) {
				films[count++] = new ComedyFilm((ComedyFilm) f);
				return true;
			}
		}
		return false;
	}

	public boolean addFirst(Watchable f) throws StudioException {
		if (count < films.length) {
			for (int i = count; i > 0; i--) {
				films[i] = films[i - 1];
			}
			if (f instanceof ActionFilm) {
				films[0] = new ActionFilm((ActionFilm) f);
				count++;
				return true;
			} else if (f instanceof ComedyFilm) {
				films[0] = new ComedyFilm((ComedyFilm) f);
				count++;
				return true;
			}
		}
		return false;
	}

	public boolean addAt(Watchable f, int pos) throws StudioException {
		if (pos < 0 || pos > count)
			return false;
		if (count < films.length) {
			for (int i = count; i > pos; i--) {
				films[i] = films[i - 1];
			}
			if (f instanceof ActionFilm) {
				films[pos] = new ActionFilm((ActionFilm) f);
				count++;
				return true;
			} else if (f instanceof ComedyFilm) {
				films[pos] = new ComedyFilm((ComedyFilm) f);
				count++;
				return true;
			}
		}
		return false;
	}

	public boolean remove(Watchable f) {
		for (int i = 0; i < count; i++) {
			if (films[i] instanceof Film && f instanceof Film) {
				if (((Film) films[i]).equals((Film) f)) {
					for (int j = i; j < count - 1; j++) {
						films[j] = films[j + 1];
					}
					films[count - 1] = null;
					count--;
					return true;
				}
			}
		}
		return false;
	}

	public Watchable removeFirst() {
		if (count == 0)
			return null;
		Watchable removed = films[0];
		for (int i = 0; i < count - 1; i++) {
			films[i] = films[i + 1];
		}
		films[count - 1] = null;
		count--;
		return removed;

	}

	public Watchable removeLast() {
		if (count == 0)
			return null;
		Watchable removed = films[count - 1];
		films[count - 1] = null;
		count--;
		return removed;
	}

	public Watchable removeAt(int pos) {
		if (pos < 0 || pos >= count)
			return null;
		Watchable removed = films[pos];
		for (int i = pos; i < count - 1; i++) {
			films[i] = films[i + 1];
		}
		films[count - 1] = null;
		count--;
		return removed;
	}

	public Watchable getAt(int i) {
		if (i < 0 || i >= count)
			return null;
		return films[i];
	}

	public Watchable getLongest() {
		if (count == 0)
			return null;
		return getLongestHelper(0);
	}

	public Watchable getLongestHelper(int i) {
		if (i == count - 1)
			return films[i];
		Watchable longest = getLongestHelper(1);
		if (films[i].getRuntime() > longest.getRuntime()) {
			return films[i];
		}
		return longest;
	}

}
