package jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

class ArtistCompare implements Comparable<Song> {
	ArrayList<Song> songList = new ArrayList<Song>();

	public int compareTo(Song one, Song two) {
		return one.getArtist().compareTo(two.getArtist());
	}

	public void go() {
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);

		ArtistCompare artistCompare = new ArtistCompare();

		System.out.println(songList);

	}

	public void getSongs() {
		try {
			File file = new File("SongListMore.txt");
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = buffer.readLine()) != null) {
				addSong(line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);

	}

	@Override
	public int compareTo(Song arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
