package v1;

public class Playlist {
	private String name;
	private Playable items[];
	private int count;

	public Playlist(String name, int size) throws IllegalArgumentException {
		if(size<=0)
			throw new IllegalArgumentException("Invalid size: " + size);
		this.name = name;
		items = new Playable[size];
		count = 0;
	}

	public boolean add(Playable p) {
		for (int i = 0; i < count; i++) {
			if (((Media) items[i]).equals((Media) p))
				return false;
		}
		if (count < items.length) {
			if (p instanceof Song) {
				items[count++] = (Song) p;
				return true;
			} else if (p instanceof Podcast) {
				items[count++] = (Podcast) p;
				return true;
			}
		}

		return false;
	}

	public boolean remove(Playable p) {
		for (int i = 0; i < count; i++) {
			if (((Media) items[i]).equals((Media) p)) {
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

	public Playable getAt(int i) {
		if (i < 0 || i >= count)
			return null;
		return items[i];
	}

	public void playAll() {
		for (int i = 0; i < count; i++)
			items[i].play();
	}

	public Playable getLongest() {
		if (count == 0)
			return null;
		return getLongestHelper(0);
	}

	public Playable getLongestHelper(int i) {
		if (i == count - 1)
			return items[i];
		Playable longest = getLongestHelper(i + 1);
		if (items[i].getDuration() > longest.getDuration())
			return items[i];
		return longest;
	}

	public String toString() {
		String s = name + " Playlist (" + count + ")";
		for (int i = 0; i < count; i++) {
			if (items[i] instanceof Song)
				s += ((Song) items[i]).toString() + "\n";
			else if (items[i] instanceof Podcast)
				s += ((Podcast) items[i]).toString() + "\n";
		}
		return s;
	}

}
