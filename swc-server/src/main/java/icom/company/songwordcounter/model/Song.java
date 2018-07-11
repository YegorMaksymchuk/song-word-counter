package icom.company.songwordcounter.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Document
public class Song {

	@Id
	Long id;
	@Field
	Actor actor;
	@Field
	String title;
	@Field
	Set<String> text = new HashSet<String>(0);

}
