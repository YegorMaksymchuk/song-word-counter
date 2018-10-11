package com.company.songwordcounter.model;

import com.google.common.base.Objects;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Document(collection = "actors")
public class Actor implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equal(id, actor.id) &&
                Objects.equal(name, actor.name) &&
                Objects.equal(image, actor.image) &&
                Objects.equal(description, actor.description) &&
                Objects.equal(songs, actor.songs);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, image, description, songs);
    }
}
