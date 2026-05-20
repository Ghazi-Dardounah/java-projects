package labFinalEx;

public abstract class Film implements Watchable {
	protected String title;
	protected String director;
	protected int runtime;
	protected int year;
	protected Actor[] actors;
	protected int actorCount;

	public Film(String title, String director, int runtime, int year, int actorCapacity) throws StudioException {
		if (year < 1900 || actorCapacity <= 0) {
			throw new StudioException("Invalid Film: year= " + year + ", capacity= " + actorCapacity);
		}
		actors = new Actor[actorCapacity];
		this.title = title;
		this.director = director;
		this.runtime = runtime;
		this.year = year;
		actorCount = 0;
	}

	public Film(Film other) throws StudioException {
		this.title = other.title;
		this.director = other.director;
		this.year = other.year;
		this.runtime = other.runtime;
		this.actorCount = other.actorCount;
		this.actors = new Actor[other.actors.length];
		for (int i = 0; i < other.actorCount; i++) {
			this.actors[i] = other.actors[i];
		}
	}

	public int getRuntime() {
		return runtime;
	}

	public int getYear() {
		return year;
	}

	public boolean addActor(Actor a) {
		if (actorCount < actors.length) {
			for (int i = 0; i < actorCount; i++) {
				if (actors[i].equals(a)) {
					return false;
				}
			}
			actors[actorCount++] = a;
			return true;
		}
		return false;
	}

	public Actor getActor(int i) {
		if (i < 0 || i >= actorCount)
			return null;
		return actors[i];
	}

	public int getActorCount() {
		return actorCount;
	}

	public abstract double calculateBudget();

	public boolean equals(Film other) {
		if (this.title.equals(other.title) && this.director.equals(other.director)) {
			return true;
		}
		return false;
	}

	public String toString() {
		return title + " by " + director + " (" + year + ", " + runtime + "min)" + "[" + actorCount + "]" + "\n";
	}
	public String listActors() {
		if(actorCount == 0)
			return "no actors";
		String s = title + " cast: ";
		for(int i =0 ; i<actorCount ; i++) {
			s+= actors[i].toString()+", ";
		}
		return s;
	}

}
