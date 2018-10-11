package com.company.songwordcounter.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Document(collection = "songs")
public class Song implements Serializable {

	@Id
	private Long id;
	@Field
	private Actor actor;
	@Field
	private String title;
	@Field
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
