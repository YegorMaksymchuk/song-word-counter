package com.company.songwordcounter.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Song {

	private Long id;
	private Actor actor;
	private String title;
	private Set<String> words = new HashSet<String>(0);

	@Override
	public String toString() {
		return new StringBuilder()
				.append("{ id: " + id + ", ")
				.append("actor: " + actor + ", ")
				.append("title: " + title + ", ")
				.append("words: [" + words + "] }").toString();
	}
}
