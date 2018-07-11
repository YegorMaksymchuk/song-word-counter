package icom.company.songwordcounter.controller;

import icom.company.songwordcounter.model.Actor;
import icom.company.songwordcounter.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ActorRestController {


	private final ActorService actorService;


	@Autowired
	public ActorRestController(ActorService actorService) {
		this.actorService = actorService;
	}

	@RequestMapping(path = "/actors", method = RequestMethod.GET)
	public ResponseEntity<List<Actor>> getAllActors() {
		return new ResponseEntity<List<Actor>>(actorService.getAllActors(), HttpStatus.OK);
	}

}
