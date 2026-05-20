package labFinalEx;

public class ActionFilm extends Film {
	private int stuntCount;
	private String ratings;

	public ActionFilm(String title, String director, int runtime, int year, int actorCapacity, int stuntCount,
			String ratings) throws StudioException {
		super(title, director, runtime, year, actorCapacity);
		this.stuntCount = stuntCount;
		this.ratings = ratings;
	}

	public ActionFilm(ActionFilm other) throws StudioException {
		super(other);
		this.stuntCount = other.stuntCount;
		this.ratings = other.ratings;
	}

	public void play() {
		System.out.println("Now playing action: " + title + " [" + ratings + "]");
	}

	public double calculateBudget() {
		return runtime * 200000.0 + stuntCount * 50000.0;
	}

	public boolean equals(Film other) {
		if (super.equals(other) == true && other instanceof ActionFilm
				&& this.ratings.equals(((ActionFilm) other).ratings)) {
			return true;
		}
		return false;
	}

	public String toString() {
		return super.toString() + "[rating: " + ratings + "]";
	}

}
