package icom.company.songwordcounter.service;

import icom.company.songwordcounter.model.Actor;
import icom.company.songwordcounter.model.Song;
import icom.company.songwordcounter.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SongServiceImpl implements SongService {

	private SongRepository songRepository;

	@Autowired
	public SongServiceImpl(SongRepository songRepository) {
		this.songRepository = songRepository;
	}

	@Override
	public List<Song> getAllSongsByActor(Actor actor) {
		return songRepository.findByActor(actor);
	}
}
