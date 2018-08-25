package jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class SongListTreeSet implements Box {
	ArrayList<Song> songList = new ArrayList<Song>();

	@Override
	public void go() {
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		TreeSet<Song> songSet = new TreeSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);

	}

	@Override
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
	public void addSong() {
		// TODO Auto-generated method stub
		
	}

}
