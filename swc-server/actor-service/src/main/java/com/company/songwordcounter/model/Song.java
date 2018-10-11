package com.company.songwordcounter.model;

import com.google.common.base.Objects;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Song song = (Song) o;
		return Objects.equal(id, song.id) &&
				Objects.equal(actor, song.actor) &&
				Objects.equal(title, song.title) &&
				Objects.equal(words, song.words);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, actor, title, words);
	}
}
