package com.company.songwordcounter.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Set;

@Getter
@Setter
@Document(collection = "actors")
public class Actor {
	@Id
	private Long id;
	@Field
	private String name;
	@Field
	private String image;
	@Field
	private String description;
	@Field
	private Set<Song> songs;

	@Override
	public String toString() {
		return new StringBuilder()
				.append("{ id: " + id + ", ")
				.append("name: " + name + ", ")
				.append("image: " + image + ", ")
				.append("description: " + description + ", ")
				.append("songs: [" + songs + "]}").toString();
	}
}
