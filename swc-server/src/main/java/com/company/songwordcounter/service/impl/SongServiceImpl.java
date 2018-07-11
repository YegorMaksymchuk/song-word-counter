package com.company.songwordcounter.service.impl;

import com.company.songwordcounter.model.Actor;
import com.company.songwordcounter.model.Song;
import com.company.songwordcounter.repository.SongRepository;
import com.company.songwordcounter.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("songService")
public class SongServiceImpl implements SongService {

	private SongRepository songRepository;

	@Autowired
	public SongServiceImpl(SongRepository songRepository) {
		this.songRepository = songRepository;
	}


	public List<Song> getAllSongsByActor(Actor actor) {
		return songRepository.findByActor(actor);
	}

	@Override
	public Song save(Song song) {
		return songRepository.save(song);
	}

	@Override
	public Song remove(Long id) {
		Song song = songRepository.findById(id).get();
		songRepository.deleteById(id);
		return song;
	}

	@Override
	public Song update(Long id, Song song) {
		Song tmp = songRepository.findById(id).get();
		if (tmp != null) {
			tmp.setActor(song.getActor());
			tmp.setTitle(song.getTitle());
			tmp.setWords(song.getWords());
			songRepository.save(tmp);
			return tmp;
		} else return null;
	}

	@Override
	public Song getOne(Long id) {
		return songRepository.findById(id).get();
	}

	@Override
	public List<Song> getAll() {
		return songRepository.findAll();
	}
}
