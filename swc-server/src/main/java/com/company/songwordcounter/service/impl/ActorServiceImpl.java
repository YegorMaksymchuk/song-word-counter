package com.company.songwordcounter.service.impl;

import com.company.songwordcounter.model.Actor;
import com.company.songwordcounter.repository.ActorRepository;
import com.company.songwordcounter.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("actorService")
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
		Actor tmp = actorRepository.findById(id).get();
		if (tmp != null) {
			tmp.setName(actor.getName());
			tmp.setSongs(actor.getSongs());
			tmp.setDescription(actor.getDescription());
			tmp.setImage(actor.getImage());
			actorRepository.save(tmp);
			return tmp;
		} else return null;
	}

	@Override
	public Actor getOne(Long id) {
		return actorRepository.findById(id).get();
	}

	@Override
	public List<Actor> getAll() {
		return actorRepository.findAll();
	}
}
