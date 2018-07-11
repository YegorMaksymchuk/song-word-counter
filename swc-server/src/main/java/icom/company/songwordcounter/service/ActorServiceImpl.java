package icom.company.songwordcounter.service;

import icom.company.songwordcounter.model.Actor;
import icom.company.songwordcounter.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ActorServiceImpl implements ActorService {

	private ActorRepository actorRepository;

	@Autowired
	public ActorServiceImpl(ActorRepository actorRepository) {
		this.actorRepository = actorRepository;
	}

	@Override
	public List<Actor> getAllActors() {
		return actorRepository.findAll();
	}
}
