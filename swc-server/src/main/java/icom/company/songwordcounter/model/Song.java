package icom.company.songwordcounter.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Data
@Document
public class Song {

	Long id;
	Actor actor;
	String title;
	Set<String> text = new HashSet<String>(0);

}
