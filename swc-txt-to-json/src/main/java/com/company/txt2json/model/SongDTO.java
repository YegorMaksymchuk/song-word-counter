package com.company.txt2json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashSet;
import java.util.Set;

public class SongDTO {
	@JsonProperty("id")
	Long id;
	@JsonProperty("actor")
	ActorDTO actor;
	@JsonProperty("title")
	String title;
	@JsonProperty("words")
	Set<String> words = new HashSet<String>(0);

	public SongDTO(Long id, ActorDTO actor, String title, Set<String> words) {
		this.id = id;
		this.actor = actor;
		this.title = title;
		this.words = words;
	}

	public SongDTO(ActorDTO actor, String title, Set<String> words) {
		this.actor = actor;
		this.title = title;
		this.words = words;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("{ id: " + id + ", ")
				.append("actor: " + actor + ", ")
				.append("title: " + title + ", ")
				.append("words: [" + words + "] }").toString();
	}
}
