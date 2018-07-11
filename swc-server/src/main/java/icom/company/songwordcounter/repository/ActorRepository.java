package icom.company.songwordcounter.repository;

import icom.company.songwordcounter.model.Actor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends MongoRepository<Actor, Long> {
}
