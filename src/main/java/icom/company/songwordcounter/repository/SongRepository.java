package icom.company.songwordcounter.repository;

import icom.company.songwordcounter.model.Actor;
import icom.company.songwordcounter.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SongRepository {

	private MongoTemplate mongoTemplate;

	@Autowired
	public SongRepository(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}


	public List<Song> findByActor(Actor actor) {
		return mongoTemplate.find(Query.query(Criteria.where("actor").is(actor.getName())), Song.class);
	}

}
