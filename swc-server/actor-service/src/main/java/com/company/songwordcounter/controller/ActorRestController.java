package com.company.songwordcounter.controller;

import com.company.songwordcounter.model.Actor;
import com.company.songwordcounter.service.ActorService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@Slf4j
@CrossOrigin
@RestController
@RequestMapping(value = "/api/actor")
public class ActorRestController {

	private final ActorService actorService;

	@Autowired
	public ActorRestController(ActorService actorService) {
		this.actorService = actorService;
	}

	@RequestMapping(path = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Actor>> listOfActors() {
		return new ResponseEntity<List<Actor>>(actorService.getAll(), HttpStatus.OK);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Actor> get(@PathVariable Long id) {
		return new ResponseEntity<Actor>(actorService.getOne(id), HttpStatus.OK);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Actor> delete(@PathVariable Long id) {
		return new ResponseEntity<Actor>(actorService.remove(id), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/add", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Actor> add(@RequestBody Actor actor) {
		return new ResponseEntity<Actor>(actorService.save(actor), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/update", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Actor> update(@RequestParam String id, @RequestBody Actor actor) {
		return new ResponseEntity<Actor>(actorService.update(Long.valueOf(id), actor), HttpStatus.OK);
	}
}
