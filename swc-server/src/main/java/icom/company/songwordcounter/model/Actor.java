package icom.company.songwordcounter.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Set;

@Getter
@Setter
@Document
public class Actor {

	@Id
	Long id;
	@Field
	String name;
	@Field
	Set<Song> songs;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return "Actor{" +
				"id=" + id +
				", name='" + name + '\'' +
				", songs=" + songs +
				'}';
	}
}
