package labFinalEx;

public class ComedyFilm extends Film {
	private int jokeCount;
	private boolean isStadnup;

	public ComedyFilm(String title, String director, int runtime, int year, int actorCapacity, int jokeCount,
			boolean isStadnup) throws StudioException {
		super(title, director, runtime, year, actorCapacity);
		this.jokeCount = jokeCount;
		this.isStadnup = isStadnup;
	}

	public ComedyFilm(ComedyFilm other) throws StudioException {
		super(other);
		this.jokeCount = other.jokeCount;
		this.isStadnup = other.isStadnup;
	}

	public void play() {
		System.out.println("Streaming comedy: " + title + " ( " + jokeCount + " jokes)");
	}

	public double calculateBudget() {
		return runtime * 80000.0 + jokeCount * 1000.0;
	}

	public boolean equals(Film other) {
		if (super.equals(other) == true && other instanceof ComedyFilm
				&& this.jokeCount == ((ComedyFilm) other).jokeCount) {
			return true;
		}
		return false;
	}

	public String toString() {
		return super.toString() + "[" + jokeCount + "jokes]";
	}

}
