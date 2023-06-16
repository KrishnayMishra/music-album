package com.ibm.service;

import java.util.List;

import com.ibm.entity.Album;

public interface AlbumService {
	
	int save(Album a);
	
	Album find(int id);
	
	List<Album> list();
	
	boolean remove(int id);
	
	Album byTitle(String title);
	
	List<Album> byArtist(String artist);
	
	List<Album> byGenre(String name);

}
