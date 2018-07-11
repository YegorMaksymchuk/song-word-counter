package icom.company.songwordcounter.service;


import icom.company.songwordcounter.model.Actor;
import icom.company.songwordcounter.model.Song;

import java.util.List;

public interface SongService {

	List<Song> getAllSongsByActor(Actor actor);

}
