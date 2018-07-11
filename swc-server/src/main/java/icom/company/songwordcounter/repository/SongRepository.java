package icom.company.songwordcounter.repository;

import icom.company.songwordcounter.model.Actor;
import icom.company.songwordcounter.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends MongoRepository<Song, Long> {

	List<Song> findByActor(Actor actor);

}
