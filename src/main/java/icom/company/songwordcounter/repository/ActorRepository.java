package icom.company.songwordcounter.repository;

import icom.company.songwordcounter.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActorRepository {

	private MongoTemplate mongoTemplate;

	@Autowired
	public ActorRepository(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public List<Actor> findAll() {
		return mongoTemplate.findAll(Actor.class);
	}
}
