package icom.company.songwordcounter.controller;

import icom.company.songwordcounter.model.Song;
import icom.company.songwordcounter.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class SongRestController {

	private SongService songService;

	@Autowired
	public SongRestController(SongService songService) {
		this.songService = songService;
	}

	public ResponseEntity<Song> getOne(@PathVariable Long id) {
		return new ResponseEntity<Song>(songService.getOne(id), HttpStatus.OK);
	}
}
