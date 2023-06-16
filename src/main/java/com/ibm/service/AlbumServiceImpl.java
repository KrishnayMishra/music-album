package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Album;
import com.ibm.repo.AlbumRepository;


@Service
public class AlbumServiceImpl implements AlbumService {
	
	@Autowired
    private AlbumRepository repo;
	@Override
	public int save(Album a) {
		// TODO Auto-generated method stub
		repo.save(a);
		return a.getId();
	}

	@Override
	public Album find(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Album> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean remove(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
		return true;
	}

	@Override
	public Album byTitle(String title) {
		// TODO Auto-generated method stub
		return repo.findByTitle(title);
	}

	@Override
	public List<Album> byArtist(String artist) {
		// TODO Auto-generated method stub
		return repo.findByArtist(artist);
	}

	@Override
	public List<Album> byGenre(String genre) {
		// TODO Auto-generated method stub
		return repo.findByGenre(genre);
	}
	
	
	
	
	
	

}
