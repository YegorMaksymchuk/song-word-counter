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
	public Actor save(Actor actor) {
		return actorRepository.save(actor);
	}

	@Override
	public Actor remove(Long id) {
		Actor tmp = actorRepository.findById(id).get();
		actorRepository.deleteById(id);
		return tmp;
	}

	@Override
	public Actor update(Long id, Actor actor) {
		return null;
	}

	@Override
	public Actor getOne(Long id) {
		return null;
	}

	@Override
	public List<Actor> getAll() {
		return null;
	}
}
