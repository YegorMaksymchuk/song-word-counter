package com.company.songwordcounter.controller;

import com.company.songwordcounter.dto.Report;
import com.company.songwordcounter.model.Actor;
import com.company.songwordcounter.service.SparkService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
@RequestMapping(path = "/api/spark")
public class SparkController {

	private SparkService sparkService;

	@Autowired
	public SparkController(SparkService sparkService) {
		this.sparkService = sparkService;
	}

	@RequestMapping(path = "/inspect", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Report> inspectActors(@RequestBody List<Actor> actors) {
		return new ResponseEntity<Report>(sparkService.findCoincidence(actors), HttpStatus.OK);
	}
}
