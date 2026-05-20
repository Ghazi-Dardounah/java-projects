package v1;

public abstract class Media implements Playable {
	protected String title;
	protected String artist;
	protected double duration;
	public Media(String title, String artist, double duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	public double getDuration() {
		return duration;
	}
	public abstract double calculateRoyalty();
	public boolean equals(Media other) {
		if(this.title.equals(other.title) && this.artist.equals(other.artist)) {
			return true;
		}
		return false;
	}
	public String toString() {
		return title + " - "+artist + " ( "+duration+" min)";
	}
	

}
