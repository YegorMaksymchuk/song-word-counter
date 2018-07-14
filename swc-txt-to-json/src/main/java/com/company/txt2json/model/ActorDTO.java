package com.company.txt2json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public class ActorDTO {

	@JsonProperty("id")
	Long id;

	@JsonProperty("name")
	String name;

	@JsonProperty("songs")
	Set<SongDTO> songs;

	public ActorDTO(Long id, String name, Set<SongDTO> songs) {
		this.id = id;
		this.name = name;
		this.songs = songs;
	}

	public ActorDTO(String name, Set<SongDTO> songs) {
		this.name = name;
		this.songs = songs;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("{ id: " + id + ", ")
				.append("name: " + name + ", ")
				.append("songs: [" + songs + "]}").toString();
	}

}
