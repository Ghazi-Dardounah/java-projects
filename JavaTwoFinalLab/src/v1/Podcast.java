package v1;

public class Podcast extends Media {
	private String showName;
	private int episode;

	public Podcast(String title, String artist, double duration, String showName, int episode) {
		super(title, artist, duration);
		this.showName = showName;
		this.episode = episode;
	}

	public void play() {
		System.out.println("Streaming Podcast: " + title + " -- " + showName + " Ep#" + episode);
	}

	public double calculateRoyalty() {
		return duration * 0.2;
	}
	public String toString() {
		return "Podcast: "+title+" - "+artist+" | "+showName + " Ep#" + episode+" ("+duration+" min)";
	}

}
