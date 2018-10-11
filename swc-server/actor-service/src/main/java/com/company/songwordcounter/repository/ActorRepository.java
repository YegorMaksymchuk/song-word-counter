package com.company.songwordcounter.repository;

import com.company.songwordcounter.model.Actor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends MongoRepository<Actor, Long> {
}
