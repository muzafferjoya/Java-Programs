package jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

class JukeBox implements Box {
	ArrayList<Song> songList = new ArrayList<Song>();

	@Override
	public void go() {
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);

	}

	@Override
	public void getSongs() {
		try {
			File file = new File("SongList.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
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
