package vlad;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

	String name;
	String artist;
	ArrayList<Song> songs;

	public Album(String name, String artist/* , ArrayList<Song> songs */) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	
	
	//add the song
	public boolean addSong (String title, Double duration) {
		if (findSong(title) == null) {
			songs.add(new Song(title, duration));
			return true;
		} else {
			System.out.println("This already exists");
		    return false;
		}
	}
	
	//find the song that we might add after
	public Song findSong (String title) {
		for (Song checkedSong : songs)
			if (checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
        return null;
	}
	
	public boolean addToPlayList (int trackNumber, LinkedList<Song> PlayList) {
		int index = trackNumber - 1;
		if (index > 0 && index <= this.songs.size()) {
			PlayList.add(this.songs.get(index));
			return true;
		}
		System.out.println("this albuym does not have song with trackNumber" +trackNumber);
		return false;
	}
	
	public boolean addToPlayList (String title, LinkedList<Song> PlayList) {
		for (Song checkedSong : this.songs) 
			if (checkedSong.getTitle().equals(title)) {
				PlayList.add(checkedSong);
			return true;
		    }
		System.out.println(title + "there is no such song in album");
	    return false;
	}
}


























