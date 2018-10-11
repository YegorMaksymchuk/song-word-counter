package com.company.songwordcounter.controller;

import com.company.songwordcounter.model.Actor;
import com.company.songwordcounter.model.Song;
import com.company.songwordcounter.service.SongService;
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
@RequestMapping(path = "/api/song")
public class SongRestController {

	private SongService songService;

	@Autowired
	public SongRestController(SongService songService) {
		this.songService = songService;
	}

	@RequestMapping(path = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Song>> getAllSongs() {
		return new ResponseEntity<List<Song>>(songService.getAll(), HttpStatus.OK);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Song> getOne(@PathVariable Long id) {
		return new ResponseEntity<Song>(songService.getOne(id), HttpStatus.OK);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Song> deleteSong(@PathVariable Long id) {
		return new ResponseEntity<Song>(songService.remove(id), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/add", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Song> add(@RequestBody Song song) {
		return new ResponseEntity<Song>(songService.save(song), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/update/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Song> updateSong(@RequestParam Long id, @RequestBody Song song) {
		return new ResponseEntity<Song>(songService.update(id, song), HttpStatus.OK);
	}

	@RequestMapping(path = "/actor", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Song>> getSongsByActor(@RequestBody Actor actor) {
		return new ResponseEntity<List<Song>>(songService.getAllSongsByActor(actor), HttpStatus.OK);
	}
}
