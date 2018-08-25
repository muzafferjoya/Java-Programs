package jukebox;

public class Song implements Comparable<Song> {
	String title;
	String artist;
	String rating;
	String bpm;

	public Song(String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}

	@Override
	public int hashCode() {

		return title.hashCode();
	}

	public int compareTo(Song s) {
		return title.compareTo(s.getTitle());
	}

	@Override
	public boolean equals(Object asong) {
		Song s = (Song) asong;
		return getTitle().equals(s.getTitle());
	}

	@Override
	public String toString() {
		return title;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

	public String getBpm() {
		return bpm;
	}

}
