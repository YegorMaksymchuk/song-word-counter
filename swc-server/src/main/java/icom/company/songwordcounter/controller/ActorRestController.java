package icom.company.songwordcounter.controller;

import icom.company.songwordcounter.model.Actor;
import icom.company.songwordcounter.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class ActorRestController {


	private final ActorService actorService;


	@Autowired
	public ActorRestController(ActorService actorService) {
		this.actorService = actorService;
	}

	@RequestMapping(path = "/actors", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Actor>> getAllActors() {
		return new ResponseEntity<List<Actor>>(actorService.getAll(), HttpStatus.OK);
	}

	@RequestMapping(path = "/actor/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Actor> getOne(@PathVariable Long id) {
		return new ResponseEntity<Actor>(actorService.getOne(id), HttpStatus.OK);
	}
}
