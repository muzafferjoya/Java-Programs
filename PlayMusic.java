package jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

class PlayMusic implements Box {
	ArrayList<String> songList = new ArrayList<String>();

	@Override
	public void go() {
		getSongs();
		System.out.println(songList);

	}

	@Override
	public void getSongs() {

		try {
			File file = new File("SongList.txt");
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
		songList.add(tokens[0]);

	}

	@Override
	public void addSong() {
		// TODO Auto-generated method stub
		
	}

}
