package com.company.songwordcounter.service;

import com.company.songwordcounter.model.Actor;
import com.company.songwordcounter.model.Song;

import java.util.List;

public interface SongService extends GenericService<Song, Long> {
	List<Song> getAllSongsByActor(Actor actor);
}
