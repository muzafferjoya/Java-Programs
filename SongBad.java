package jukebox;

public class SongBad implements Comparable<SongBad> {
	String title;
	String rating;
	String bpm;
	String artist;

	public String getTitle() {
		return title;
	}

	public String getRating() {
		return rating;
	}

	public String getBpm() {
		return bpm;
	}

	public String getArtist() {
		return artist;
	}

	public SongBad(String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}

	public boolean equals(Object aSong) {
		SongBad s = (SongBad) aSong;
		return getTitle().equals(s.getTitle());

	}

	@Override
	public int compareTo(SongBad s) {
		// TODO Auto-generated method stub
		return title.compareTo(s.getTitle());
	}

	public String toString() {
		return title;
	}

}
