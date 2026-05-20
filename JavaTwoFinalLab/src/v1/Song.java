package v1;

public class Song extends Media {
	private String genre;
	private boolean explicit;
	public Song(String title, String artist, double duration, String genre, boolean explicit) {
		super(title, artist, duration);
		this.genre = genre;
		this.explicit = explicit;
	}
	public void play() {
		System.out.println("Now playing song: "+title+" - "+artist+" ["+genre+"]");
	}
	public double calculateRoyalty() {
		if(explicit)
			return duration*0.10;
		return duration*0.05;
	}
	public String toString() {
		return "Song: "+title+" - "+artist+" ["+genre+"]"+" ("+duration+" min)";
	}

}
