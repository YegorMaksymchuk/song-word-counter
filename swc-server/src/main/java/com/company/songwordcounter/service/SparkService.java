package com.company.songwordcounter.service;

import com.company.songwordcounter.model.Actor;
import com.company.songwordcounter.model.Song;

import java.util.List;

public interface SparkService {
	List<Song> getSongs(Actor actor);


}